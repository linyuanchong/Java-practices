import javax.swing.*;
import java.awt.*;

public class Lab4Part3 extends JFrame
{
	public Lab4Part3()
	{
		super("Lab4Part3");

	 	Container contentPane = getContentPane();
	  	JPanel submitPanel = new JPanel();

   		//Create and add new JLabel.
    	JLabel submitLabel = new JLabel("Push the button: ");

    	//Create and add new JButton.
    	JButton submitButton = new JButton("Push me!");

	  	submitPanel.add(submitLabel);
	  	submitPanel.add(submitButton);

	  	contentPane.add(submitPanel);

		//Set frame size and visibility.
		setSize(450,350);
		setVisible( true );
	}


	public static void main(String args [])
	{
		Lab4Part3 openFrame = new Lab4Part3();
		openFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}
}