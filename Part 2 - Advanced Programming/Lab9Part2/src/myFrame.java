import javax.swing.*;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class myFrame extends JFrame implements ActionListener{
	
	//Components.
	JLabel myLabel = new JLabel("Hello");
	JButton button1 = new JButton("Chinese");
	JButton button2 = new JButton("English");
	JButton button3 = new JButton("Malay");
	
	//Locale and resourcebundle.
	static Locale gLocale = new Locale("de","DE");
	static ResourceBundle transBundle = ResourceBundle.getBundle("trans.trans", gLocale);

	
	public myFrame() {
		
		super("Lab9Part2");
		
		//Add listeners.
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		
		getContentPane().setLayout(new GridLayout(4,1));
		getContentPane().add(myLabel);
		getContentPane().add(button1);
		getContentPane().add(button2);
		getContentPane().add(button3);
		
		setSize(250, 400);
		setVisible(true);	
		
	}
	
	public static void main(String args[]) {
		new myFrame();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button1) {
			myLabel.setText(transBundle.getString("tag1"));
		}
		else if (e.getSource() == button2) {
			myLabel.setText(transBundle.getString("tag2"));
		}
		else if (e.getSource() == button3) {
			myLabel.setText(transBundle.getString("tag3"));
		}
	}
	
}