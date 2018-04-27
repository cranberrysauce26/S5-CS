import java.util.* ;
import java.awt.* ;
import java.awt.event.* ;
import java.awt.image.* ;

public class ProgramPanel extends Panel implements MouseListener, KeyListener, MouseMotionListener
{
	// instance fields
	//private PairOfEyes eyes = new PairOfEyes() ;
	private ArrayList<PairOfEyes> eyes = new ArrayList<PairOfEyes>() ;

	private Point mouse = new Point() ;

	private double zoomRatio = 1.2 ;

	Dimension dim = new Dimension() ;	// dimensions of both:
										// the video memory and the off-screen memory

	BufferedImage   osm  ;	// the address of the off-screen memory that holds the off–screen image
	Graphics  		osg ;	// the reference to the graphics of the off–screen memory

	public ProgramPanel()
	{
		addMouseListener( this ) ;
		addKeyListener( this ) ;
		addMouseMotionListener( this ) ;

		setBackground( Color.LIGHT_GRAY) ;
	}

	//public methods
	public void paint( Graphics g )
	{
		dim = getSize() ;

		// allocate a new memory for the off–screen image
		osm = new BufferedImage( dim.width, dim.height, BufferedImage.TYPE_INT_RGB ) ;

		osg = osm.getGraphics() ; // obtain the address of the off - screen grapics

		// call method update and pass the graphics as a parameter
		// all graphing instruction will be performed within the method update
		update( g ) ;


	}


	// override the default method update( Graphics )
	public void update( Graphics g )
	{

		// paint the entire off-screen image using the background color
		osg.setColor( 	Color.LIGHT_GRAY ) ;
		osg.fillRect(	0, 0, dim.width, dim.height ) ;


		// draw all images in the off - screen graphics
		for ( int i = 0 ; i < eyes	.size(); i++ )
		{
			eyes.get(i).display( osg, mouse ) ;
		}

		// copy the off-screen memory to the vidoe-memory
		g.drawImage( osm, 0, 0, this ) ;

	}


	//methods of MouseListener
	public void mouseExited(MouseEvent me)
	{
	}

	public void mouseEntered(MouseEvent me)
	{
	}

	public void mouseReleased(MouseEvent me)
	{
	}

	public void mousePressed(MouseEvent me)
	{
		Point p = me.getPoint() ;

		eyes.add( new PairOfEyes( p ) ) ;

		repaint() ;
	}

	public void mouseClicked(MouseEvent me)
	{
	}

	// methods of KeyListener
	public void keyReleased(KeyEvent ke)
	{
	}

	public void keyPressed(KeyEvent ke)
	{
		int keyCode = ke.getKeyCode() ;

		switch( keyCode )
		{
			case KeyEvent.VK_PAGE_UP	: 	for ( int i = 0 ; i < eyes.size(); i++ )
											{
												eyes.get(i).changeSize( zoomRatio ) ;
											}
											break ;

			case KeyEvent.VK_PAGE_DOWN	: 	for ( int i = 0 ; i < eyes.size(); i++ )
											{
												eyes.get(i).changeSize( 1/zoomRatio ) ;
											}
											break ;
		}

		repaint() ;

	}

	public void keyTyped(KeyEvent ke)
	{
	}


	//methods of MouseMotionListener
	public void mouseMoved( MouseEvent me)
	{
		mouse = me.getPoint() ;

		repaint() ;
	}

	public void mouseDragged( MouseEvent me)
	{}







}