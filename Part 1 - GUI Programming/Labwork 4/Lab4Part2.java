import javax.swing.*;
import java.awt.*;

public class Lab4Part2 extends JFrame
{
	public Lab4Part2()
	{
		super("My Label Frame");

	 	Container contentPane = getContentPane();
	  	JPanel labelPanel = new JPanel();

   		//Create and add first JLabel.
    	JLabel myNameLabel = new JLabel("Donovan");


    	//Create and add second JLabel.
    	JLabel myAgeLabel = new JLabel("20");

	  	labelPanel.add(myNameLabel);
	  	labelPanel.add(myAgeLabel);

	  	contentPane.add(labelPanel);

		//Set frame size and visibility.
		setSize(450,350);
		setVisible( true );
	}


	public static void main(String args [])
	{
		Lab4Part2 openFrame = new Lab4Part2();
		openFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}
}