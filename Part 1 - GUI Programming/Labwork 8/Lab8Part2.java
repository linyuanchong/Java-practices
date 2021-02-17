import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Lab8Part2 extends JFrame implements ActionListener
{
	//Create panel.
	JPanel myPanel = new JPanel();
	//Create label.
	JLabel myLabel = new JLabel();

	//Create font.
    Font myFont = new Font("Serif", Font.BOLD, 20);
  	//Set font to label.

    //Create button.
	JButton myButton = new JButton("Change colour of the text.");

	public Lab8Part2()
	{
		myLabel.setText("Colour chosen will appear here.");
		myLabel.setFont(myFont);

		//Add listener to button.
		myButton.addActionListener(this);

		//Add label to panel.
		myPanel.add(myLabel);

		//Add panel panel and button to contentpane.
		getContentPane().add(myPanel, BorderLayout.CENTER);
		getContentPane().add(myButton, BorderLayout.SOUTH);

		setSize(400,100);
		setVisible(true);
	}

	public static void main(String[] args)
	{
		new Lab8Part2();

	}

	public void actionPerformed(ActionEvent e)
	{
		//Launch color chooser and stores color.
		Color myColor = (new JColorChooser()).showDialog(myPanel, "Choose a colour for text", Color.BLACK);
		//Sets color for text in label.
		myLabel.setForeground(myColor);
	}

}