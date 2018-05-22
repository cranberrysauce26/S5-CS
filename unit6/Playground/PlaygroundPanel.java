import java.awt.*;
import java.util.*;
public class PlaygroundPanel extends Panel {
	private static final long serialVersionUID = 42L;
	private static final int physicsStepPeriod = 100;
 
	public PlaygroundPanel() {
		beginTime();
	}

	public void paint(Graphics g) {

	}

	private void beginTime() {
		Timer t = new Timer();
		TimerTask motion = new TimerTask() {
			public void run() {
				timeStep();
				repaint();
			}
		};
		t.scheduleAtFixedRate(motion, 0, physicsStepPeriod);
	}

	private void timeStep() {

	}
}