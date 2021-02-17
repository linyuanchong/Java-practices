import javax.swing.*;
import java.awt.*;

import java.awt.GraphicsConfiguration;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Lab7Part1 extends JFrame
{
	public Lab7Part1()
	{
		super("Lab7Part1");

	 	Container contentPane = getContentPane();

	 	//Create 2 panels.
	 	JPanel panelA = new JPanel();
	 	JPanel panelB = new JPanel();

		//Vertical box layout for 1st panel.
	 	panelA.setLayout(new BoxLayout(panelA,BoxLayout.Y_AXIS));
	 	//Horizontal box layout for 2nd panel.
	 	panelB.setLayout(new BoxLayout(panelB,BoxLayout.X_AXIS));

		//Components(labels) for panelA.
	 	JLabel labelA1= new JLabel("Panel 1 Component 1");
	 	JLabel labelA2= new JLabel("Panel 1 Component 2");
	 	JLabel labelA3= new JLabel("Panel 1 Component 3");
	 	//Components(labels) for panelB.
	 	JLabel labelB1= new JLabel("Panel 2 Component 1");
	 	JLabel labelB2= new JLabel("Panel 2 Component 2");
	 	JLabel labelB3= new JLabel("Panel 2 Component 3");

		//Add components(labels) to pabels.
	 	panelA.add(labelA1);
	 	panelA.add(labelA2);
	 	panelA.add(labelA3);
	 	panelB.add(labelB1);
	 	panelB.add(labelB2);
	 	panelB.add(labelB3);

		contentPane.add(panelA, BorderLayout.NORTH);
		contentPane.add(panelB, BorderLayout.CENTER);

		//Set frame size and visibility.
		setSize(500,300);
		setVisible( true );

	}


	public static void main(String args [])
	{
		new Lab7Part1();
	}

}