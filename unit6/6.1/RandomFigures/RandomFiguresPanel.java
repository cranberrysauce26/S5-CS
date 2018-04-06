import java.awt.*;
import java.util.Random;
import java.awt.event.*;
public class RandomFiguresPanel extends Panel implements MouseListener {
	static final long serialVersionUID = 42L;

	private Random rand = new Random();

	public RandomFiguresPanel() {
		addMouseListener(this);
	}

	public void paint(Graphics g) {

		int numFigures = rand.nextInt(20)+1;
		Dimension dim = getSize();

		while (numFigures-- > 0) {
			int type = rand.nextInt(1);
			g.setColor(new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat()));
			int x = rand.nextInt(dim.width);
			int y = rand.nextInt(dim.height);

			int w = rand.nextInt(dim.width-x);
			int h = rand.nextInt(dim.height-y);
			if (type == 1) {
				// rectangle
				
				g.drawRect(x,y,w,h);
			} else {
				// oval
				g.fillOval(x,y,w,h);
			}
		}
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
		repaint();
		// System.out.println(me);
	}

	@Override
	public void mouseClicked(MouseEvent me) {
		// System.out.println(me);
	}
}