import java.awt.*;

public class ProgramWindow extends Frame {

	// required to get rid of the warning
	private static final long serialVersionUID = 42L;

	CircleDisplay panel = new CircleDisplay();

	static final int width = 1000;
	static final int height = 800;
	static final int xPosition = 100;
	static final int yPosition = 100;

	static final String title = "A Circle";

	public ProgramWindow() {

		add(panel);

		setTitle(title);
		setSize(width, height);
		setLocation(xPosition, yPosition);		

		setVisible(true);
	}
}