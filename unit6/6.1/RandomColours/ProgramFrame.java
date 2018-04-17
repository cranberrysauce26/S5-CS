import java.awt.*;
public class ProgramFrame extends Frame {
	// required to get rid of the warning
	private static final long serialVersionUID = 42L;
	
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