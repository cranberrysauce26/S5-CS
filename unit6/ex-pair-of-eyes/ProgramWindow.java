import java.awt.* ;

public class ProgramWindow extends Frame
{
	ProgramPanel panel = new ProgramPanel() ;

	public ProgramWindow()
	{
		add( panel ) ;

		setTitle("Eyes Watching the Mouse") ;

		setSize(1000, 800) ;

		setLocation(100, 100) ;

		setResizable(true) ;

		setVisible( true ) ;
	}
}