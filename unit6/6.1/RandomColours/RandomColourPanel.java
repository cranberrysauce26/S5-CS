import java.awt.*;
import java.util.Random;
public class RandomColourPanel extends Panel {
	private Random rand = new Random();
	public void paint(Graphics g) {
		Dimension dim = getSize();
		for (int x = 0; x < dim.width; ++x) {
			for (int y = 0; y < dim.height; ++y) {
				g.setColor(new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat()));
				g.drawLine(x,y,x,y);
			}
		}
	}
}