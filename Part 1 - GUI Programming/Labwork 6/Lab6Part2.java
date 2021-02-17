import javax.swing.*;
import java.awt.*;

import java.awt.Dimension;
import java.awt.BorderLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Lab6Part2 extends JFrame implements ActionListener
{
	//Create combobox in public to go across classes.
	public String[] colourArray = {"Red", "Green", "Blue"};
	public JComboBox<String> colourSelector = new JComboBox<String>(colourArray);

	//Create button in public to go across classes.
	public JButton changeColour = new JButton("Change Colour");

	//Create panel in public to go across classes.
	public JPanel myPanel = new JPanel();

	//Constructor(create and show items).
	public Lab6Part2()
	{
		super("Lab6Part2");

		//Create contentpane.
		Container myContentPane = getContentPane();

		//Add action listener to combobox.
		colourSelector.addActionListener(this);
		//Add action listener to button.
		changeColour.addActionListener(this);

		myPanel.add(colourSelector);
		myPanel.add(changeColour);

		//Add panel to contentpane.
	  	myContentPane.add(myPanel);

		//Set frame size and visibility.
		setSize(300,100);
		setVisible( true );
	}


	public static void main(String args [])
	{
		Lab6Part2 openFrame = new Lab6Part2();
		openFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}

	//Listener.
	public void actionPerformed(ActionEvent e)
	{
		Object source = e.getSource();
		if (source == colourSelector)
		{
			if (colourSelector.getSelectedIndex() == 0)
			{
				myPanel.setBackground(Color.RED);
			}
			else if (colourSelector.getSelectedIndex() == 1)
			{
				myPanel.setBackground(Color.GREEN);
			}
			else if (colourSelector.getSelectedIndex() == 2)
			{
				myPanel.setBackground(Color.BLUE);
			}
		}
	}

}