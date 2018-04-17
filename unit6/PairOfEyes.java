import java.awt.*;
import java.awt.event.*;
public class PairOfEyes {
	public static void main(String[] args) {
		// private Panel 
		Frame f = new Frame();
		f.setTitle("Pair of Eyes");
		f.setSize(800, 600);
		f.setLocation(100, 100);
		f.add(new EyesPanel());
		f.setVisible(true);
	}
}

class EyesPanel extends Panel implements MouseListener, MouseMotionListener, KeyListener{

	// public

	public EyesPanel() {
		setBackground(backgroundColor);
		scale = 1;
		addMouseListener(this);
		addMouseMotionListener(this);
		addKeyListener(this);
	}

	// drawing

	public void paint(Graphics g) {

		if (dim == null || !dim.equals(getSize())) {
			dim = getSize();
			center = new Point(dim.width/2, dim.height/2);
			mousePos = center;
		}

		width = computeWidth();

		Point left = new Point(center.x - halfSep(), center.y);
		Point right = new Point(center.x + halfSep(), center.y);
		drawEye(g, left);
		drawEye(g, right);
		drawPupil(g, left);
		drawPupil(g, right);
	}

	private void drawPupil(Graphics g, Point eyeCenter) {
		int radius = pupilRadius();
		g.setColor(pupilColor);
		Point pupilCenter = shiftedPupilCenter(eyeCenter);
		g.fillOval(pupilCenter.x-radius, pupilCenter.y-radius, 2 * radius, 2 * radius);
	}

	private void drawEye(Graphics g, Point eyeCenter) {
		int radius = eyeRadius();
		g.setColor(eyeColor);
		g.fillOval(eyeCenter.x-radius, eyeCenter.y-radius, 2 * radius, 2 * radius);
	}

	// listener interface methods

	// methods of MouseListener
	public void mouseExited(MouseEvent me){}

	public void mouseEntered(MouseEvent me){}

	public void mouseReleased(MouseEvent me){}

	public void mousePressed(MouseEvent me){}

	public void mouseClicked(MouseEvent me) {
		center = new Point(me.getX(), me.getY());
		repaint();
	}

	// methods of MouseMotionListener
	public void mouseMoved(MouseEvent me) {
		mousePos = me.getPoint();
		repaint();
	}

	public void mouseDragged(MouseEvent me){}

	// methods of KeyListener
	public void keyPressed(KeyEvent ke) {
		int code = ke.getKeyCode();
		switch (code) {
			case KeyEvent.VK_UP:
				shiftCenter(center, 0, -1);
				repaint();
				break;
			case KeyEvent.VK_DOWN:
				shiftCenter(center, 0, 1);
				repaint();
				break;
			case KeyEvent.VK_RIGHT:
				shiftCenter(center, 1, 0);
				repaint();
				break; 
			case KeyEvent.VK_LEFT:
				shiftCenter(center, -1, 0);
				repaint();
				break;
			case KeyEvent.VK_PAGE_UP:
				scale += Ruler.scaleShift;
				repaint();
				break;
			case KeyEvent.VK_PAGE_DOWN:
				scale -= Ruler.scaleShift;
				repaint();
				break;
		}
	}

	public void keyReleased(KeyEvent ke) {}
	public void keyTyped(KeyEvent ke) {}

	// private

	// tweakable settings

	// required to get rid of the warning
	private static final long serialVersionUID = 42L;

	private static final Color backgroundColor = Color.RED;
	private static final Color pupilColor = Color.BLACK;
	private static final Color eyeColor = Color.WHITE;

	// all tweakable measurement parameters

	private static class Ruler {
		// the amount the scale goes up or down by when presses pg up or pg down
		public static final double scaleShift = 0.1;
		// the ratio between the pupil and eye radius
		public static final double pupilToEye = 0.4;
		// the ratio between the seperation between the edges of the eye to the radius of the eye
		public static final double sepToEye = 0.75;
		// the ratio between the max offset of the pupil to the radius of the eye
		public static final double pupilMaxOffsetToEye = 0.6; // not necessarily 1-pupilToEye
		// the ratio between the mouse drag reference distance and the screen's width
		public static final double dragReferenceToScreen = 0.25;
		// the ratio between the shift amount when presses up/down to the screen's height or left/right to the screen's width
		public static final double shiftToScreen = 0.1;
		// the preferred combined width of the eyes and the separation
		public static final double preferredWidthToScreen = 0.5;
	}

	// state dependent methods

	private int eyeRadius() {
		return (int) ((float)width / (4.0+Ruler.sepToEye));
	}

	private int pupilRadius() {
		return (int) (Ruler.pupilToEye * (float)width / (4.0+Ruler.sepToEye));
	}

	private int halfSep() {
		return (int) ( (float) width / (4.0 / Ruler.sepToEye + 1.0) / 2.0 + eyeRadius()); 
	}

	private int computeWidth() {
		return (int)Math.min(
			Ruler.preferredWidthToScreen * dim.width * scale,
			Math.min(2 * Math.min(center.x, dim.width-center.x), 2 * Math.min(center.y, dim.height-center.y))
		);
	}

	private double pupilDragDist(double mouseD) {
		return Math.min(Ruler.pupilMaxOffsetToEye * eyeRadius(), Ruler.pupilMaxOffsetToEye * eyeRadius() * mouseD / (Ruler.dragReferenceToScreen * dim.width) );
	}

	private void shiftCenter(Point p, int dirx, int diry) {
		if (withinScreen(new Point(p.x + (int) (dirx * dim.width * Ruler.shiftToScreen), p.y + (int) (diry * dim.height * Ruler.shiftToScreen))) ){
			center = new Point(p.x + (int) (dirx * dim.width * Ruler.shiftToScreen), p.y + (int) (diry * dim.height * Ruler.shiftToScreen) );
		}
	}

	private Point shiftedPupilCenter(Point c) {
		int deltaX = mousePos.x-center.x;
		int deltaY = mousePos.y-center.y;
		double mouseDist = Math.sqrt((float) deltaX*deltaX + (float) deltaY * deltaY);
		double offsetDist = pupilDragDist(mouseDist);
		int offsetX = (int) ( (float) deltaX / mouseDist * offsetDist);
		int offsetY = (int) ( (float) deltaY / mouseDist * offsetDist);
		return new Point(c.x + offsetX, c.y+offsetY);
	}

	private boolean withinScreen(Point p) {
		return p.x >= 0 && p.x <= dim.width && p.y >= 0 && p.y <= dim.height;
	}

	// state dependent variables

	private double scale = 1;
	private Point center = null;
	private Point mousePos = null;
	private Dimension dim = null;
	private int width=0;
}