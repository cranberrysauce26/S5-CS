import java.awt.*;
public class ProgramFrame extends Frame {
	static final long serialVersionUID = 43L;

	private Panel panel = new RandomFiguresPanel();
	public ProgramFrame() {
		setTitle("Random Colours");
		setSize(800, 600);
		setLocation(100, 100);
		setResizable(true);
		add(panel);
		setVisible(true);
	}
}