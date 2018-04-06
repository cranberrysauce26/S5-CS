import java.awt.*;

public class ProgramFrame extends Frame {

	static final long serialVersionUID = 43L;

	Panel panel = new MovingCircle();

	static final int width = 1000;
	static final int height = 800;
	static final int xPosition = 100;
	static final int yPosition = 100;

	static final String title = "A Circle";

	public ProgramFrame() {

		add(panel);

		setTitle(title);
		setSize(width, height);
		setLocation(xPosition, yPosition);		

		setVisible(true);
	}
}