import java.awt.*;
import java.util.Random;
import java.awt.event.*;
public class InscribedPolygonPanel extends Panel implements MouseListener {
	private static final long serialVersionUID = 42L;
	private static final int maxNumSides = 10;

	private Random rand = new Random();

	Point pnt = null;
	Dimension dim = new Dimension();

	public InscribedPolygonPanel() {
		addMouseListener(this);
	}

	@Override
	public void paint(Graphics g) {

		super.paint(g);
		getSize(dim);

		int n = 3+rand.nextInt(maxNumSides-2);

		if (pnt == null) pnt = new Point(dim.width/2, dim.height/2);

		System.out.println(pnt);

		int r = Math.min(Math.min(pnt.x, dim.width-pnt.x), Math.min(pnt.y, dim.height-pnt.y));

		int[] x = new int[n];
		int[] y = new int[n];
		double ang = 0;
		for (int i = 0; i < n; ++i, ang += 2 * Math.PI / n) {
			x[i] = pnt.x+(int) (r * Math.cos(ang));
			y[i] = pnt.y+(int) (r * Math.sin(ang));
		}

		g.setColor(new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat()));
		g.drawPolygon(x,y,n);
	}

	// methods of MouseListener
	@Override
	public void mouseExited(MouseEvent me) {
		// System.out.println(me);
	}

	@Override
	public void mouseEntered(MouseEvent me) {
		// System.out.println(me);
	}

	@Override
	public void mouseReleased(MouseEvent me) {
		// System.out.println(me);
	}

	@Override
	public void mousePressed(MouseEvent me) {
		pnt = new Point(me.getX(), me.getY());
		repaint();
		// System.out.println(me);
	}

	@Override
	public void mouseClicked(MouseEvent me) {
		// System.out.println(me);
	}
}