import javax.swing.*;
import java.awt.*;

public class Lab4Part1 extends JFrame
{
	public Lab4Part1()
	{
		//Set frame title.
		super("Donovan");

		//Create contentPane as a layer to store components.
	 	Container contentPane = getContentPane();

	  	//Create JPanel to group components.
	  	JPanel panel = new JPanel();

	  	//Add the JPanel.
	  	contentPane.add(panel);

		//Set frame size and visibility.
		setSize(450,350);
		setVisible( true );
	}


	public static void main(String args [])
	{
		Lab4Part1 openFrame = new Lab4Part1();
		openFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}
}