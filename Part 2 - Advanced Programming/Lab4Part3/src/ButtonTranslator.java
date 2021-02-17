import java.awt.*;
import java.awt.event.*;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.*;
import javax.swing.event.*;

/**
 * @author linyu
 *
 */
public class ButtonTranslator extends JFrame implements ActionListener {
	
	static Locale gLocale = new Locale("de","DE");
	static ResourceBundle transBundle = ResourceBundle.getBundle("trans.trans", gLocale);
	
	//Components.
	public JButton fourButton = new JButton(transBundle.getString("tag1"));
	public JButton fiveButton = new JButton(transBundle.getString("tag2"));
	public JButton sixButton = new JButton(transBundle.getString("tag3"));
	public JButton translate = new JButton("TRANSLATE TO GERMAN");

	//JPanels.
 	JPanel topPanel = new JPanel();
 	JPanel bottomPanel = new JPanel();
 	JPanel mainPanel = new JPanel();

	/**
	 * 
	 */
	public ButtonTranslator()
	{
		super("ButtonTranslator");

		translate.addActionListener(this);
		
		//Set grid layout for panels.
		topPanel.setLayout(new GridLayout(1, 3));
		bottomPanel.setLayout(new GridLayout(1, 1));
		mainPanel.setLayout(new GridLayout(2, 1));

		topPanel.add(fourButton);
		topPanel.add(fiveButton);
		topPanel.add(sixButton);
		bottomPanel.add(translate);
		mainPanel.add(topPanel);
		mainPanel.add(bottomPanel);
		
		getContentPane().add(mainPanel);

		//Set frame size and visibility.
		setSize(500,200);
		setVisible(true);

	}


	/**
	 * @param args
	 */
	public static void main(String args [])
	{
		new ButtonTranslator();
	}

	/**
	 *
	 */
	public void actionPerformed(ActionEvent e)
	{
		fourButton.setText(transBundle.getString("tag4"));
		fiveButton.setText(transBundle.getString("tag5"));
		sixButton.setText(transBundle.getString("tag6"));
	}

}