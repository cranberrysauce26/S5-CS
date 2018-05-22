import java.awt.* ;
/*
Template provided in class
I added a move function at the bottom and the variables speed and velx, vely
*/

public class PairOfEyes
{
	// instance fields
	private Point	center 		= new Point(300, 200) ;  // center of a eyes
	private int 	radius 		= 40 ;			// ...
	private double	distRatio  	= 0.2 ;
	private double	pupilRatio 	= 0.3 ;
	private Color	eyeColor	= Color.WHITE ;
	private Color	pupilColor	= Color.CYAN ;
	
	private int maxComponentSpeed = 20;

	private int velx = 0;
	private int vely = 0;

	public PairOfEyes( Point c)
	{
		this.center.x = c.x ;
		this.center.y = c.y ;
		velx = (int)( (0.5-Math.random())*maxComponentSpeed);
		vely = (int)( (0.5- Math.random())*maxComponentSpeed);
		System.out.printf("velx = %d, vely = %d\n", velx, vely);
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

	public void move(int left, int top, int right, int bottom) {
		center.x += velx;
		center.y += vely;
		int xOffset = (int) (2* radius + distRatio*radius/2);
		if (center.x + xOffset > right || center.x - xOffset < left) velx *= -1;
		if (center.y + radius > bottom || center.y - radius < top) vely *= -1;
	}
}