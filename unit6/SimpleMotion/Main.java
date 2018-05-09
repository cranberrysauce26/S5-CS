import java.awt.*;
public class Main {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setSize(800, 600);
		f.setLocation(100, 100);
		f.add(new SimpleMotion());
		f.setVisible(true);
	}
}