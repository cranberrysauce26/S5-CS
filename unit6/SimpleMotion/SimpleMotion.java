// File SimpleMotion.java
import java.awt.* ;
import java.awt.event.* ;
import java.util.* ;
import java.awt.image.* ;

public class SimpleMotion extends Panel implements KeyListener
{
	private static final long serialVersionUID = 42L;
	// instant fields
	private Particle prt = new Particle( 100, 100, 50, 40 ) ;
	private Dimension d = null ; // dimension of the panel
	private long delay = 1000 ; // delay before the particle starts moving, in milliseconds
	private long period = 100 ; // frequency of moves, in milliseconds
	private double coef = 1.2; // factor of increase/decrease of speed

	BufferedImage   osm;	// the address of the off-screen memory that holds the off-screen image
	Graphics  		osg;	// the reference to the graphics of the off-screen memory

	// constructor
	public SimpleMotion()
	{
		addKeyListener( this ) ;
		Timer tm = new Timer() ;

		TimerTask motion = new TimerTask()
		{
			public void run() {
				if ( d != null ) {
					prt.move( period / 1000.0 , 0, d.width, 0, d.height ) ;
					repaint();
				}
			}
		} ;
		tm.scheduleAtFixedRate( motion, delay, period ) ;
	}

	// public methods
	public void paint( Graphics g )
	{
		d = getSize() ;
		// obtain the current dimensions of the Panel
		// notice that d is used in the method run()

		osm = new BufferedImage( d.width, d.height, BufferedImage.TYPE_INT_RGB ) ;
		osg = osm.getGraphics() ; // obtain the address of the off - screen grapics
		draw(g);
	}
	public void keyPressed( KeyEvent ke)
	{
		switch ( ke.getKeyCode() )
		{
		case KeyEvent.VK_UP:
			prt.changeSpeed( 1 , coef ) ;
			// increase vy only
			break ;
		case KeyEvent.VK_DOWN:
			prt.changeSpeed( 1, 1/ coef ) ;
			// decrease vy only
			break ;
		case KeyEvent.VK_LEFT:
			prt.changeSpeed( 1/ coef, 1) ;
			// decrease vx only
			break ;
		case KeyEvent.VK_RIGHT:
			prt.changeSpeed(coef, 1 ) ;
			// increase vx only
			break ;
		case KeyEvent.VK_PAGE_UP:
			prt.changeSpeed(coef, coef) ; // increase both
			break ; // vx and vy
		case KeyEvent.VK_PAGE_DOWN:
			prt.changeSpeed(1/coef, 1/coef) ; // decrease both
			break ;
		}
	}
	// vx and vy
	public void keyReleased( KeyEvent ke) {}
	public void keyTyped ( KeyEvent ke) {}

	private void draw(Graphics g) {
		prt.display(g) ;
		g.drawImage(osm, 0, 0, this);
		repaint();
	}
} // the end of class SimpleMotion