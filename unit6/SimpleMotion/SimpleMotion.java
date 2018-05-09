// File SimpleMotion.java
import java.awt.* ;
import java.awt.event.* ;
import java.util.* ;
public class SimpleMotion extends Panel implements KeyListener
{
	private static final long serialVersionUID = 42L;
	// instant fields
	private Particle prt = new Particle( 100, 100, 50, 40 ) ;
	private Dimension d = null ; // dimension of the panel
	private long delay = 1000 ; // delay before the particle starts moving, in milliseconds
	private long period = 100 ; // frequency of moves, in milliseconds
	private double coef = 1.2; // factor of increase/decrease of speed
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
					repaint() ;
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
		prt.display( g) ;
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
} // the end of class SimpleMotion