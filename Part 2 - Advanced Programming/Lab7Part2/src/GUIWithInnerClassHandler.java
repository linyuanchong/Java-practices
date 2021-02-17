import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author linyu
 *
 */

//Outer class.
public class GUIWithInnerClassHandler extends JFrame {
	
	//Components.
	public JButton myButton = new JButton("PRESS");
	public JLabel myLabel = new JLabel("LABEL");
	public JPanel myPanel = new JPanel(new GridLayout(2,1));
	
	//Method to add all components.
	public GUIWithInnerClassHandler()
   	{
		myPanel.add(myButton);
		myPanel.add(myLabel);
		getContentPane().add(myPanel);
		setSize(600, 250);
		setVisible(true);
    }
	
	//Inner class to add ActionListener.
	class ButtonHandler extends JFrame implements ActionListener{		
		
		//Add listener.
		public ButtonHandler() {
			myButton.addActionListener(this);
		}
		
		public void actionPerformed(ActionEvent e) {
			myLabel.setText("Inner class has set the outer label: " + getClass().getName());
		}
	}
	
	//Call the class.
	public static void main(String args[])
	{
		new GUIWithInnerClassHandler().new ButtonHandler();
	}

}