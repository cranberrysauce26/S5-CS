import java.awt.*;
import java.util.*;
public class Playground {
	public static void main(String[] args) {
		// Timer tm = new Timer() ;

		// TimerTask motion = new TimerTask()
		// {
		// 	public void run() {
		// 		System.out.println("Hello");
		// 	}
		// } ;
		// tm.scheduleAtFixedRate( motion, 100, 1000 ) ;
		Frame f = new Frame();
		f.setSize(800, 600);
		f.setLocation(100, 100);
		f.add(new PlaygroundPanel());
		f.setVisible(true);
	}
}