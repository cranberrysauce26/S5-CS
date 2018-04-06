import java.awt.*;
public class ProgramFrame extends Frame {
	private Panel randomColourPanel = new RandomColourPanel();
	public ProgramFrame() {
		setTitle("Random Colours");
		setSize(800, 600);
		setLocation(100, 100);
		setResizable(true);
		add(randomColourPanel);
		setVisible(true);
	}
}