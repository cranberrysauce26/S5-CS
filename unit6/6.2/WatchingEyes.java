import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Panel;
import java.util.Random;
public class WatchingEyes {
	public static void main(String[] args) {
		Frame f = new Frame();
		// Panel p = new WatchingEyesPanel();
		f.setTitle("Watching Eyes");
		f.setSize(800, 600);
		f.setLocation(100, 100);
		f.add(new WatchingEyesPanel());
		f.add(new WatchingEyesPanel());
		f.setVisible(true);
	}
}

class WatchingEyesPanel extends Panel {
	static final long serialVersionUID = 69L;
	static Random rand = new Random();
	public WatchingEyesPanel() {

	}

	public void paint(Graphics g) {
		int numFigures = 1;
		Dimension dim = getSize();

		Point center = new Point(dim.width/2, dim.height/2);

		
		
	}
}

// class WatchingEyesFrame extends Frame {
// 	static final long serialVersionUID = 69L;
// 	public WatchingEyesFrame() {
// 		setTitle("Watching Eyes");

// 	}
// }