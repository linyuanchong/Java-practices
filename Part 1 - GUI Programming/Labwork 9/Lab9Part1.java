import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Lab9Part1 extends JFrame implements ActionListener
{
	JFrame myFrame = new JFrame("Lab9Part1");
	JPanel myPanel = new JPanel();
	JButton myButton = new JButton("Launch Input Dialog");
	public String surname = "";

	public Lab9Part1()
	{

		myPanel.add(myButton);
		myButton.addActionListener(this);
		myFrame.add(myPanel);

        myFrame.setSize(300,100);
        myFrame.setVisible(true);
   }


   public static void main(String[] args)
   {
	   new Lab9Part1();
   }

   	public void actionPerformed(ActionEvent e)
   	{
		surname = JOptionPane.showInputDialog("Please enter your surname below:");
		myFrame.setTitle(surname);
	}

}


