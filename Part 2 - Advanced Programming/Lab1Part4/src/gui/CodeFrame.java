package gui;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

import java.awt.Dimension;
import java.awt.BorderLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * @author linyu
 *
 */
public class CodeFrame extends JFrame implements ActionListener{
	
	public JPanel myPanel = new JPanel();	
	public static JLabel encodeLabel = new JLabel("Enter text to encode: ");
	public static JLabel decodeLabel = new JLabel("The encoded text is: ");
	public static JTextField encodeField = new JTextField();
	public static JTextField decodeField = new JTextField();
	public static JButton encodeButton = new JButton("ENCODE");
	
	public static String input = "";
	public static String output = "";
	public static char blah;
	
	public CodeFrame() {
		
		super("CodeFrame");
		
		encodeButton.addActionListener(this);
		
		myPanel.setLayout(new GridLayout(5, 1));
		myPanel.add(encodeLabel);
		myPanel.add(encodeField);
		myPanel.add(decodeLabel);
		myPanel.add(decodeField);
		myPanel.add(encodeButton);
		
		getContentPane().add(myPanel);
		
		setSize(300,300);
		setVisible( true );
	}
	
	/**
	 * @param input: input as input.
	 * @return a value is returned.
	 */
	public static String encoder(String input) {
		for (int i = 0; i < input.length(); i++) {
			//decodeField sets text based on input characters + 1.
			decodeField.setText(decodeField.getText()+((char)(input.charAt(i) + 1)));
		}
		return input;
	}
	
	//Call frame.
	public static void main(String args []) {
		new CodeFrame();
	}
	
	
	public void actionPerformed(ActionEvent arg0) {
		//Input gets text of encodeField.
		input = encodeField.getText();		
		//Call function.
		encoder(input);		
	}
}
