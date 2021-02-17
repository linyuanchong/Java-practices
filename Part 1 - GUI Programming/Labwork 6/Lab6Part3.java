import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

import java.awt.Dimension;
import java.awt.BorderLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Lab6Part3 extends JFrame implements ListSelectionListener
{
	//Create list in public to go across classes.
	public String subject[] = {"Maths", "GUI", "Networking", "Object-Oriented Programming", "Database", "Research Skills", "Academic English", "Communication Skills", "C++", "Multimedia"};
	public JList subjectList = new JList(subject);

	//Create label in public to go across classes.
	public JLabel topLabel = new JLabel("Please choose your favourite subjects so far!");

	//Create textfield in public to go across classes.
	public JTextField bottomField = new JTextField(30);

	public Lab6Part3()
	{
		super("Lab6Part3");

		//Create panes and panels.
		Container myContentPane = getContentPane();
		JPanel myPanel1 = new JPanel();
		JPanel myPanel2 = new JPanel();
		JPanel myPanel3 = new JPanel();

		//Add listener to list.
		subjectList.addListSelectionListener(this);

		//Add items to panels for sort.
		myPanel1.add(topLabel);
		myPanel2.add(subjectList);
		myPanel3.add(bottomField);


		//Add panels to content with borderlayout.
		myContentPane.add(myPanel1, BorderLayout.NORTH);
		myContentPane.add(myPanel2);
		myContentPane.add(myPanel3, BorderLayout.SOUTH);

		setSize(500, 300);
		setVisible(true);

	}

	public static void main(String args [])
	{
		Lab6Part3 openFrame = new Lab6Part3();
		openFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}
	public void valueChanged(ListSelectionEvent e)
	{
		//Set variable "source" ad user input.
		Object source = e.getSource();
		//If user input coresponds to list.
		if (source == subjectList)
		{
			String intro = "Response will appear here: ";
			//Set textfield.
			bottomField.setText(intro + subjectList.getSelectedValue());
		}
	}
}
