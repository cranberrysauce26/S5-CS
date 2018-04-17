import java.awt.*;

public class CircleDisplay extends Panel {

	// required to get rid of the warning
	private static final long serialVersionUID = 42L;

	static final Color backgroundColor = Color.BLACK;
	static final Color circleColor = Color.YELLOW;

	public CircleDisplay() {
		setBackground(backgroundColor);
	}

	public void paint(Graphics g) {
		Dimension dim = getSize();

		int x = dim.width / 2;
		int y = dim.height / 2;

		int r = Math.min(x, y) / 2;

		g.setColor(circleColor);
		g.fillOval(x - r, y - r, 2 * r, 2 * r);
	}
}