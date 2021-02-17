package gui;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;

import warningsystem.*;
import logging.AssignmentLogger;
import exceptions.MaxWindChecker;
import exceptions.MaxWindException;


/**
 * @author linyu
 *
 */
public class WindWeatherWarningGUI extends JFrame implements ActionListener {
	
	//Locales.
	Locale mLocale = new Locale("ms","MY");
	ResourceBundle myMBundle = ResourceBundle.getBundle("internationalization.internationalization_ms", mLocale);
	Locale eLocale = new Locale("eg","IRL");
	ResourceBundle myEBundle = ResourceBundle.getBundle("internationalization.internationalization_eg", mLocale);
	
	//JPanels.
	public JPanel mainPanel = new JPanel();
	public JPanel leftPanel = new JPanel();
	public JPanel rightPanel = new JPanel();
	//JButtons.
	public JButton checkButton = new JButton("Check warnings");
	public JButton translateButtonE = new JButton("Translate to English");
	public JButton translateButtonM = new JButton("Translate to Malay");
	
	//JTextFields.
	public JTextField inputField = new JTextField("Start by input a value here, then press the check button.");
	//JLabels.
	public JLabel showImageLabel = new JLabel();
	public JLabel showMessageLabel = new JLabel();
	
	//Controller (true for English, false for Malay).
	boolean controller = true;
	
	/**
	 * 
	 */
	//Constructor.
	public WindWeatherWarningGUI() {
		
		super("Wind Weather Warning System");
		AssignmentLogger.logConstructor(this);
		
		//Add listeners.
		checkButton.addActionListener(this);
		translateButtonE.addActionListener(this);
		translateButtonM.addActionListener(this);
		//Set layouts.
		mainPanel.setLayout(new GridLayout(1, 1));
		leftPanel.setLayout(new GridLayout(5, 1));
		//Set colors.
		showMessageLabel.setOpaque(true);
		showMessageLabel.setForeground(Color.white);
		showMessageLabel.setBackground(Color.black);
		translateButtonE.setOpaque(true);
		translateButtonE.setBackground(Color.white);
		translateButtonM.setOpaque(true);
		translateButtonM.setBackground(Color.white);
		
		//Add components.
		leftPanel.add(inputField);
		leftPanel.add(checkButton);
		leftPanel.add(translateButtonE);
		leftPanel.add(translateButtonM);
		leftPanel.add(showMessageLabel);
		rightPanel.add(showImageLabel);
		mainPanel.add(leftPanel);
		mainPanel.add(rightPanel);
		
		getContentPane().add(mainPanel);
		
		//Visibility and size.
		setSize(750,320);
		setVisible(true);
	}
	
	/**
	 * @param args
	 */
	public static void main (String args[]) {
		AssignmentLogger.logStaticMethodEntry();
		new WindWeatherWarningGUI();
		AssignmentLogger.logStaticMethodExit();
	}
	
	/**
	 *
	 */
	//Listener.
	public void actionPerformed(ActionEvent e) {
		
		//Exceptions:
		//Check if wind speed is valid using MaxWindException(custom), system will output messages.
		try {
			MaxWindChecker.checkWindSpeed(Integer.parseInt(inputField.getText()));
		} catch (MaxWindException mxe) {
			JOptionPane.showMessageDialog(null, "Value too large! (>345kph)", "Error", JOptionPane.INFORMATION_MESSAGE);
			inputField.setText("");
			mxe.printStackTrace();
		}	
		//Check if wind speed is valid using NumberFormatException, system will output messages.
		try {
		    int inputNum = Integer.parseInt(inputField.getText());
		} catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(null, "Input an integer!", "Error", JOptionPane.INFORMATION_MESSAGE);
			inputField.setText("");
			nfe.printStackTrace();
		}
		
		//Warning checks.
		//Check warning (English).
		if (e.getSource() == checkButton && controller == true) {
			int windSpeed = Integer.parseInt(inputField.getText());
			if (windSpeed < GreenWindWarning.toplimit) {
				showMessageLabel.setText(myEBundle.getString("tag4"));
				showMessageLabel.setForeground(Color.green);
				ImageIcon greenIcon = new ImageIcon("WindImages/" + GreenWindWarning.name + ".png");
				showImageLabel.setIcon(greenIcon);
			}
			else if (windSpeed >= YellowWindWarning.botlimit && windSpeed < YellowWindWarning.toplimit) {
				showMessageLabel.setText(myEBundle.getString("tag5"));
				showMessageLabel.setForeground(Color.yellow);
				ImageIcon greenIcon = new ImageIcon("WindImages/" + YellowWindWarning.name + ".png");
				showImageLabel.setIcon(greenIcon);
			}
			else if (windSpeed >= OrangeWindWarning.botlimit && windSpeed < OrangeWindWarning.toplimit) {
				showMessageLabel.setText(myEBundle.getString("tag6"));
				showMessageLabel.setForeground(Color.orange);
				ImageIcon greenIcon = new ImageIcon("WindImages/" + OrangeWindWarning.name + ".png");
				showImageLabel.setIcon(greenIcon);
			}
			else if (windSpeed >= RedWindWarning.botlimit) {
				showMessageLabel.setText(myEBundle.getString("tag7"));
				showMessageLabel.setForeground(Color.red);
				ImageIcon greenIcon = new ImageIcon("WindImages/" + RedWindWarning.name + ".png");
				showImageLabel.setIcon(greenIcon);
			}
		}		
		//Check warning (Malay).
		else if (e.getSource() == checkButton && controller == false) {
			int windSpeed = Integer.parseInt(inputField.getText());
			if (windSpeed < GreenWindWarning.toplimit) {
				showMessageLabel.setText(myMBundle.getString("tag4"));
				showMessageLabel.setForeground(Color.green);
				ImageIcon greenIcon = new ImageIcon("WindImages/" + GreenWindWarning.name + ".png");
				showImageLabel.setIcon(greenIcon);
			}
			else if (windSpeed >= YellowWindWarning.botlimit && windSpeed < YellowWindWarning.toplimit) {
				showMessageLabel.setText(myMBundle.getString("tag5"));
				showMessageLabel.setForeground(Color.yellow);
				ImageIcon greenIcon = new ImageIcon("WindImages/" + YellowWindWarning.name + ".png");
				showImageLabel.setIcon(greenIcon);
			}
			else if (windSpeed >= OrangeWindWarning.botlimit && windSpeed < OrangeWindWarning.toplimit) {
				showMessageLabel.setText(myMBundle.getString("tag6"));
				showMessageLabel.setForeground(Color.orange);
				ImageIcon greenIcon = new ImageIcon("WindImages/" + OrangeWindWarning.name + ".png");
				showImageLabel.setIcon(greenIcon);
			}
			else if (windSpeed >= RedWindWarning.botlimit) {
				showMessageLabel.setText(myMBundle.getString("tag7"));
				showMessageLabel.setForeground(Color.red);
				ImageIcon greenIcon = new ImageIcon("WindImages/" + RedWindWarning.name + ".png");
				showImageLabel.setIcon(greenIcon);
			}
		}
		
		//Translations:
		//Translation (English).
		if (e.getSource() == translateButtonE) {
			translateButtonE.setText(myEBundle.getString("tag1"));
			translateButtonM.setText(myEBundle.getString("tag2"));
			checkButton.setText(myEBundle.getString("tag3"));
			controller = true;
		}
		//Translation (Malay).
		if (e.getSource() == translateButtonM) {
			translateButtonE.setText(myMBundle.getString("tag1"));
			translateButtonM.setText(myMBundle.getString("tag2"));
			checkButton.setText(myMBundle.getString("tag3"));
			controller = false;
		}

	}

}
