import java.awt.FlowLayout;
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
public class GUIWithAnonymousInnerClass extends JFrame {
	
	//Method to add all components.
	public static void main(String args[]) {
		
		//Components.
		JButton myButton = new JButton("PRESS");
		JLabel myLabel = new JLabel("LABEL");
		JPanel myPanel = new JPanel(new GridLayout(2,1));
		
		GUIWithAnonymousInnerClass gwaic = new GUIWithAnonymousInnerClass();
		
		gwaic.getContentPane().setLayout(new GridLayout(2,1));
		gwaic.getContentPane().add(myButton);
		gwaic.getContentPane().add(myLabel);
		
		myButton.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent e) {
					 myLabel.setText("Inner class has set the outer label: " + getClass().getName());
				  }
			    });
		
		gwaic.setSize(600, 250);
		gwaic.setVisible(true);	
	
    }
	

}