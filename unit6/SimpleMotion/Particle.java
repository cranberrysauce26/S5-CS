// File Particle .java
import java.awt.* ;
public class Particle
{
	// common fields of the class particle
	static private Color [] colors = { Color.BLACK, Color.GRAY, Color.BLUE, Color.GREEN, Color.YELLOW, Color.RED };
	static public final double MAX_VELOCITY = 800.0 ;
	// instant fields
	double px, py ; // coordinates of the position
	double vx, vy ; // coordinates of the velocity
	double r ; // size of the particle
	// constructor
	public Particle( double posx, double posy, double v, double rad)
	{
		px = posx ;
		py = posy ;
		double angle
		= 2 * Math.PI * Math.random() ;
		vx = v * Math.cos(angle) ;
		vy = v * Math.sin(angle) ;
		r = rad ;
	}
	// chose a direction at random// public methods
	public void changeSpeed( double fx, double fy )
	{
		// fx and fy are coefficients
		vx = vx * fx ;
		vy = vy * fy ;
		// the next two lines do not allow the components of the speed exceed MAX_VELOCITY
		if ( Math.abs(vx) > MAX_VELOCITY ) vx = MAX_VELOCITY * Math.signum( vx ) ;
		if ( Math.abs(vy) > MAX_VELOCITY ) vy = MAX_VELOCITY * Math.signum( vy );
	}
	public void move( double time, int left, int right, int top, int bottom )
	{
		// find the next position of the particle
		px = px + vx * time ;
		py = py + vy * time ;
		// if the particle’s position is beyond the boundaries of the panel, the particle has to bounce
		while (px<left+r||px>right-r)// while the particle is beyond the vertical walls
		{ // change the direction of the horizontal component
			vx = -vx ;
			// of the velocity
			if ( px < left + r ) // if the particle is beyond the left wall
				px = 2*(left + r) - px ; // bounce the particle off the left wall
			else
				px = 2*(right - r) - px ; // otherwise, bounce the particle off the right wall

		}
		while ( py < top + r || py > bottom - r ) // while the particle is beyond the horizontal walls
		{ // change the direction of vertical component

			vy = -vy;
			// of the velocity
			if ( py > bottom - r ) // if the particle is lower than the bottom
				py = 2*(bottom - r) - py ; // then bounce the particle off the bottom wall
			else
				py = 2*(top + r) - py ; // otherwise, bounce the particle off the top wall
		}
	}
	public void display( Graphics g )
	{
		Color tmp = g.getColor() ;
		// store the current color of the Graphics
		int index = (int)( colors.length * Math.sqrt( vx*vx+vy*vy ) / MAX_VELOCITY ) ;
		if ( index >= colors.length )
		index = colors.length - 1 ;
		g.setColor( colors[ index ] ) ;
		g.fillOval( (int)(px - r) , (int)(py - r), (int)(2*r), (int)(2*r) ) ;
		g.setColor( tmp ) ;
		// reset the current color of the Graphics
	}
}
