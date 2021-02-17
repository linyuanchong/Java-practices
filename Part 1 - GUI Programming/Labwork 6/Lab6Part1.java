import javax.swing.*;
import java.awt.*;

import java.awt.Dimension;
import java.awt.BorderLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Lab6Part1 extends JFrame implements ActionListener
{
	//Create label in public to go across classes.
	public JLabel myLabel = new JLabel("Hello");

	//Constructor(create and show items).
	public Lab6Part1()
	{
		super("Lab6Part1");

		//Create contentpane.
		Container myContentPane = getContentPane();
		//Create panel.
		JPanel myPanel1 = new JPanel();
		JPanel myPanel2 = new JPanel();

		//Create button.
		JButton myButton = new JButton("Change Label");
		//Add action listener to button.
		myButton.addActionListener(this);

		//Add itmes to panel.
		myPanel1.add(myLabel);
		myPanel2.add(myButton);

		//Add panel to contentpane.
	  	myContentPane.add(myPanel1, BorderLayout.NORTH);
	  	myContentPane.add(myPanel2, BorderLayout.SOUTH);

		//Set frame size and visibility.
		setSize(300,100);
		setVisible( true );
	}


	public static void main(String args [])
	{
		Lab6Part1 openFrame = new Lab6Part1();
		openFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}

	//Listener.
	public void actionPerformed(ActionEvent e)
	{
		if (e.getActionCommand().equals("Change Label"))
		{
			myLabel.setText("Hello World!, my listener works!");
		}
	}

}