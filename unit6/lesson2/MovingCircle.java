import java.awt.*;
import java.awt.event.*;

public class MovingCircle extends Panel implements MouseListener {

	static final long serialVersionUID = 42L;

	static final Color backgroundColor = Color.WHITE;
	static final Color circleColor = Color.YELLOW;

	int curx=0, cury = 0;

	public MovingCircle() {
		addMouseListener(this);
		setBackground(backgroundColor);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Dimension dim = getSize();

		int r = Math.min(Math.min(curx, dim.width-curx), Math.min(cury, dim.height-cury)) / 2;

		g.setColor(circleColor);
		g.fillOval(curx - r, cury - r, 2 * r, 2 * r);
	}

	// methods of MouseListener
	@Override
	public void mouseExited(MouseEvent me) {
		// System.out.println(me);
	}

	@Override
	public void mouseEntered(MouseEvent me) {
		curx = me.getX();
		cury = me.getY();
		repaint();
		// System.out.println(me);
	}

	@Override
	public void mouseReleased(MouseEvent me) {
		// System.out.println(me);
	}

	@Override
	public void mousePressed(MouseEvent me) {
		curx = me.getX();
		cury = me.getY();
		repaint();
		// System.out.println(me);
	}

	@Override
	public void mouseClicked(MouseEvent me) {
		// System.out.println(me);
	}
}