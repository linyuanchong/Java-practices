import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;


public class Lab8Part1 extends JFrame
{
	public Lab8Part1()
	{
		super("Lab8Part1");

		//Create desktop pane.
		JDesktopPane myDesk = new JDesktopPane();
		//Create inner frame. (sizable, closable, maximize, minimize)
		JInternalFrame myFrame = new JInternalFrame("Inner Frame" , true, true, true, true);
		//Create panel for internal frame.
		JPanel myPanel = new JPanel();
		//Create button and label for myPanel.
		JButton myButton = new JButton("Button in Internal Frame");
		JLabel myLabel = new JLabel("Label in Internal Frame");

		//Set size and visibility for inner frame.
		myFrame.setSize(300,300);
		myFrame.setVisible(true);

		//Add components to panel.
		myPanel.add(myButton);
		myPanel.add(myLabel);

		//Add panel to inner frame.
		myFrame.add(myPanel);

		//Add inner frame to desktop pane.
        myDesk.add(myFrame);

		//Set desktop pane as content pane.
        setContentPane(myDesk);

        setSize(500,500);
        setVisible(true);
   }


   public static void main(String[] args)
   {
	   new Lab8Part1();
   }

}



