import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.*;
import javax.swing.event.*;

/**
 * @author linyu
 *
 */
public class FullTranslationGUI extends JFrame implements ActionListener {
	
	//Locale and bundles.
	static Locale gLocale = new Locale("de","DE");
	static ResourceBundle transBundle = ResourceBundle.getBundle("trans.trans",gLocale);
	
	//Locale array that stores all locales.
	public Locale[] availableLocales = Calendar.getAvailableLocales();
	//ComboBox arrays.
	public String[] boxArrayE = {"English", "French"};
	public String[] boxArrayF = {"Anglais", "Française"};
	
	//ComboBox model.
	DefaultComboBoxModel modelE = new DefaultComboBoxModel(boxArrayE);
	DefaultComboBoxModel modelF = new DefaultComboBoxModel(boxArrayF);
	
	//Components.
 	public JPanel myPanel = new JPanel();
 	public JButton listButton = new JButton(transBundle.getString("tag1"));
 	public JTextArea myText = new JTextArea();
 	public JScrollPane myScroll = new JScrollPane(myText);
 	public JComboBox myBox = new JComboBox(boxArrayE);
 	
 	//String variable to make string.
	public String valueToBeInserted = "";
 	
	/**
	 * 
	 */
	public FullTranslationGUI()
	{
		super("ButtonTranslator");	
		
		listButton.addActionListener(this);;
		myBox.addActionListener(this);;
		
		//Set grid layout for panels.
		myPanel.setLayout(new GridLayout(3, 1));
		myPanel.add(listButton);
		myPanel.add(myScroll);
		myPanel.add(myBox);
		
		getContentPane().add(myPanel);

		//Set frame size and visibility.
		setSize(500,200);
		setVisible(true);

	}


	/**
	 * @param args
	 */
	public static void main(String args [])
	{
		new FullTranslationGUI();
	}

	/**
	 *
	 */
	public void actionPerformed(ActionEvent e)
	{
		//If English comboBox pressed.
		if (myBox.getSelectedIndex() == 0) {
			listButton.setText(transBundle.getString("tag1"));
			myBox.setModel(modelE);
			if (e.getSource() == listButton) {
				for (int j = 0; j< availableLocales.length; j++)
				{
					valueToBeInserted = valueToBeInserted + j + ": " + availableLocales[j] + "\n";
				}
				
				myText.setText(valueToBeInserted);
			}
		}
		
		//If French comboBox pressed.
		if (myBox.getSelectedIndex() == 1) {
			listButton.setText(transBundle.getString("tag2"));
			myBox.setModel(modelF);
			if (e.getSource() == listButton) {
				for (int j = 0; j< availableLocales.length;  j++)
				{
					valueToBeInserted = valueToBeInserted + j + ": " + availableLocales[j] + "\n";
				}
				
				myText.setText(valueToBeInserted);
			}
		}
	}
	
}
		
	