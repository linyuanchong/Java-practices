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
public class InputFormFrame extends JFrame {
	
	//Components.
	public static JButton myButton = new JButton("PRESS");
	public static JLabel myLabel = new JLabel("LABEL");
	public static JPanel myPanel = new JPanel(new GridLayout(2,1));
	
	//Inner class to construct GUI.
	public static class RegisterPanel extends JFrame {
		public RegisterPanel() {
			super("Register Panel");
			
			myPanel.add(myButton);
			myPanel.add(myLabel);
			getContentPane().add(myPanel);
			setSize(400, 150);
			setVisible(true);
	    }
		
		public static void main(String args[]) {
			new RegisterPanel();
			//Instance of SubmitResponder.
			new InputFormFrame().new SubmitResponder();
		}
	}

	//Inner class to add listener.
	public class SubmitResponder extends JFrame implements ActionListener{		
		
		//Add listener.
		public SubmitResponder() {
			myButton.addActionListener(this);
		}
		
		public void actionPerformed(ActionEvent e) {
			myLabel.setText("Submit completed.");
		}
	}
	
	//Call the class.
	public static void main(String args[]) {
		//Instance of RegisterPanel.
		new RegisterPanel();
	}

}