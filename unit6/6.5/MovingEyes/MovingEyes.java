import java.awt.*;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.image.*;
import java.util.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class MovingEyes extends JPanel implements MouseMotionListener {

    private PairOfEyes eyes = new PairOfEyes(new Point(300, 300));
    private BufferedImage osi;
    private Graphics osg;
    private Dimension dim;
    private Point mousePos = new Point();

    private void timeStep() {
        eyes.move(0, 0, dim.width, dim.height);
    }

    private void updateImage() {
        osg.setColor(Color.orange);
        osg.fillRect(0, 0, dim.width, dim.height);
        eyes.display(osg, mousePos);
    }

    public void paint(Graphics g) {
        dim = getSize();
        osi = new BufferedImage(dim.width, dim.height, BufferedImage.TYPE_INT_RGB);
        osg = osi.getGraphics();
        updateImage();
        g.drawImage(osi, 0, 0, this);
    }

    public MovingEyes() {
        addMouseMotionListener(this);
        Timer mainLoopTimer = new Timer();
        TimerTask mainLoopTask = new TimerTask() {
            public void run() {
                if (dim != null) {
                    timeStep();
                    repaint();
                }
            }
        };
        mainLoopTimer.scheduleAtFixedRate(mainLoopTask, 0, 50);
    }

   // methods of MouseMotionListener
	public void mouseMoved(MouseEvent me) {
		mousePos = me.getPoint();
		repaint();
	}

	public void mouseDragged(MouseEvent me){}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Moving Eyes");
        frame.add(new MovingEyes());
        frame.setSize(800, 600);
        frame.setLocation(10, 100);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}