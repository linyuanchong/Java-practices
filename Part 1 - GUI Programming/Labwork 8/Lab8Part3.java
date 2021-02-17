import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.event.*;

public class Lab8Part3 extends JFrame implements MouseInputListener
{
	JPanel myPanel = new JPanel();
	JLabel myLabel = new JLabel("Mouse action will appear here: ");

	public Lab8Part3()
	{
		super("Lab8Part3");

		//Add mouse listener to panel.
		myPanel.addMouseListener(this);
		myPanel.addMouseMotionListener(this);
		//Adds a layout to panel.
		myPanel.setBorder(new LineBorder(Color.BLACK));

		getContentPane().add(myPanel, BorderLayout.CENTER);
		getContentPane().add(myLabel, BorderLayout.SOUTH);

		setSize(300,300);
		setVisible(true);
	}

	public void mouseClicked(MouseEvent e)
	{
		myLabel.setText("You clicked the mouse.");
	}

	public void mouseEntered(MouseEvent e)
	{
		myLabel.setText("Hello there mouse.");
	}

	public void mouseExited(MouseEvent e)
	{
		myLabel.setText("Goodbye mouse.");
	}

	public void mousePressed(MouseEvent e)
	{
		myLabel.setText("Mouse pressed.");
	}

	public void mouseReleased(MouseEvent e)
	{
		myLabel.setText("Mouse released.");
	}

	public void mouseDragged(MouseEvent e)
	{
		myLabel.setText("Mouse dragged.");
	}

	public void mouseMoved(MouseEvent e)
	{
		myLabel.setText("Mouse moved.");
	}

	public static void main (String[] args)
	{
		new Lab8Part3();
	}

}