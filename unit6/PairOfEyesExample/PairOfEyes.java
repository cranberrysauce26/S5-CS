import java.awt.* ;

public class PairOfEyes
{
	// instance fields
	private Point	center 		= new Point(300, 200) ;  // center of a eyes
	private int 	radius 		= 40 ;			// ...
	private double	distRatio  	= 0.2 ;
	private double	pupilRatio 	= 0.3 ;
	private Color	eyeColor	= Color.GREEN ;
	private Color	pupilColor	= Color.RED	;

	public PairOfEyes( Point c)
	{
		this.center.x = c.x ;
		this.center.y = c.y ;
	}

	//public methods
	public void display( Graphics g, Point mouse )
	{

		// draw the left eye
		int x = (int)(center.x - 2* radius - distRatio*radius/2) ;
		int y = center.y - radius ;
		g.setColor( eyeColor ) ;
		g.fillOval( x, y, 2*radius, 2*radius) ;
		g.setColor( Color.BLACK ) ;
		g.drawOval( x, y, 2*radius, 2*radius) ;

		// draw the right eye
		x = (int)(center.x + distRatio*radius/2) ;
		y = center.y - radius ;
		g.setColor( eyeColor ) ;
		g.fillOval( x, y, 2*radius, 2*radius) ;
		g.setColor( Color.BLACK ) ;
		g.drawOval( x, y, 2*radius, 2*radius) ;

/*
		// draw the left pupil
		int rad = (int)(pupilRatio * radius) ;
		x = (int)(center.x - radius - distRatio*radius/2 - rad ) ;
		y = center.y - rad ;
		g.setColor( pupilColor ) ;
		g.fillOval( x, y, 2*rad, 2*rad) ;
		g.setColor( Color.BLACK ) ;
		g.drawOval( x, y, 2*rad, 2*rad) ;
*/


		// draw the pupil of the left eye so that the eye looks at the mouse
		int rad = (int)(pupilRatio * radius) ;
		x = (int) ( center.x - distRatio*radius/2 - radius ) ;
		y = center.y ;

		double angle = Math.atan( (y - mouse.y) / (double)(mouse.x - x ) ) ;
		if ( mouse.x < x )	angle += Math.PI ;

		x = x + (int)( (radius - rad) * Math.cos(angle) );
		y = y - (int)( (radius - rad)* Math.sin(angle) );

		g.setColor(pupilColor) ;
		g.fillOval( x - rad , y - rad, 2*rad, 2*rad ) ;
		g.setColor(Color.BLACK) ;
		g.drawOval( x - rad , y - rad, 2*rad, 2*rad ) ;

/*
		// draw the right pupil
		x = (int)(center.x + radius + distRatio*radius/2 - rad) ;
		y = center.y - rad ;
		g.setColor( pupilColor ) ;
		g.fillOval( x, y, 2*rad, 2*rad) ;
		g.setColor( Color.BLACK ) ;
		g.drawOval( x, y, 2*rad, 2*rad) ;
*/

		// draw the pupil of the right eye so that the eye looks at the mouse
		rad = (int)(pupilRatio * radius) ;
		x = (int) ( center.x + distRatio*radius/2 + radius ) ;
		y = center.y ;

		angle = Math.atan( (y - mouse.y) / (double)(mouse.x - x ) ) ;
		if ( mouse.x < x )	angle += Math.PI ;

		x = x + (int)( (radius - rad) * Math.cos(angle) );
		y = y - (int)( (radius - rad)* Math.sin(angle) );

		g.setColor(pupilColor) ;
		g.fillOval( x - rad , y - rad, 2*rad, 2*rad ) ;
		g.setColor(Color.BLACK) ;
		g.drawOval( x - rad , y - rad, 2*rad, 2*rad ) ;


	}

	public void setCenter( Point p )
	{
		center.x = p.x ;
		center.y = p.y ;
	}

	public void changeSize( double ratio )
	{
		radius = (int)(radius * ratio) ;
	}

}