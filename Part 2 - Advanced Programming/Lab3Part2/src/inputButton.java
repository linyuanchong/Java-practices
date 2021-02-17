import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


/**
 * @author linyu
 *
 */
public class inputButton extends JFrame implements ActionListener
{
	//Array.
	public String stringArray[] = {"A", "B", "C"};
	//JComponents.
	public JButton myButton = new JButton("CLICK HERE");
	public JLabel myLabel = new JLabel("Please enter the index of the array to output.");
	public JTextField inputField = new JTextField();
	public JLabel outputLabel = new JLabel();
	//Panels and layouts.
	public GridLayout myGrid = new GridLayout(4, 1);
	public JPanel myPanel = new JPanel();
	
	/**
	 * 
	 */
	public inputButton()
	{
		super("inputButton");
		
		//Add listeners.
		myButton.addActionListener(this);
		
		//Add components.
		myPanel.setLayout(myGrid);
		myPanel.add(myLabel);
		myPanel.add(inputField);
		myPanel.add(myButton);
		myPanel.add(outputLabel);
		
		getContentPane().add(myPanel);

		//Set frame size and visibility.
		setSize(400,300);
		setVisible( true );

	}


	/**
	 * @param args
	 */
	public static void main(String args [])
	{
		new inputButton();
	}

	/**
	 *
	 */
	public void actionPerformed(ActionEvent e)
	{
		//Integer variable to get text from field as integer instead of String.
		int inputNum = Integer.parseInt(inputField.getText());
		
		if (e.getSource() == myButton) {
			
			//Tries to set label text with given index number here.
			try
			{
				System.out.println(stringArray[inputNum]);
				outputLabel.setText(stringArray[inputNum]);
			}
			
			//Catch exception when index out of bounds.
			catch(ArrayIndexOutOfBoundsException ex)
			{
				outputLabel.setText("Index out of bounds, please refill the field with suitable array index!");
				ex.printStackTrace();
			}
		}
	}
		
}

