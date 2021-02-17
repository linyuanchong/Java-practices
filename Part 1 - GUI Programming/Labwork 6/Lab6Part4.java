import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

import java.awt.Dimension;
import java.awt.BorderLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Lab6Part4 extends JFrame implements ActionListener
{
	//Reason why int credit located up here is to prevent it from resetting to zero everytime user clicks.
	public int credit = 0;

	//All variables create in public to go across classes.
	public JLabel topUp = new JLabel("To top-up, select an amount.");
	public JButton tenUp = new JButton("Top-up 10 euro.");
	public JButton twentyUp = new JButton("Top-up 20 euro.");
	public JButton thirtyUp = new JButton("Top-up 30 euro.");

	public JLabel amountLabel = new JLabel("0");
	//This panel is in public in alter the color.
	public JPanel amountPanel = new JPanel();

	public JButton call = new JButton("Make a call(2 euro).");
	public JButton text = new JButton("Send a text(1 euro).");

	public Lab6Part4()
	{
		super("Lab6Part4");

		//Create panes and panels.
	 	Container contentPane = getContentPane();
	 	JPanel topupPanel = new JPanel();
	 	JPanel chargePanel = new JPanel();

	 	//Set grid layout for panels.
	 	topupPanel.setLayout(new GridLayout(4, 1));
	 	amountPanel.setLayout(new GridLayout(1, 1));
	 	chargePanel.setLayout(new GridLayout(2, 1));

	 	//Set font and location for amountLabel.
	 	Font amountLabelFont = new Font("SansSerif", Font.BOLD, 30);
		amountLabel.setFont(amountLabelFont);
		amountLabel.setHorizontalTextPosition(JLabel.CENTER);
		amountLabel.setVerticalTextPosition(JLabel.CENTER);

		//Set color for amountPanel.
		amountPanel.setBackground(Color.CYAN);

	 	//Add listeners.
		tenUp.addActionListener(this);
		twentyUp.addActionListener(this);
		thirtyUp.addActionListener(this);
		call.addActionListener(this);
		text.addActionListener(this);

		//Add items to panels.
    	topupPanel.add(topUp);
    	topupPanel.add(tenUp);
    	topupPanel.add(twentyUp);
    	topupPanel.add(thirtyUp);

    	amountPanel.add(amountLabel);

		chargePanel.add(call);
		chargePanel.add(text);

		//Addand adjust panel locations.
	  	contentPane.add(topupPanel, BorderLayout.NORTH);
	  	contentPane.add(amountPanel, BorderLayout.CENTER);
	  	contentPane.add(chargePanel, BorderLayout.SOUTH);

		//Set frame size and visibility.
		setSize(200,500);
		setVisible( true );

	}


	public static void main(String args [])
	{
		Lab6Part4 openFrame = new Lab6Part4();
		openFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}

	public void actionPerformed(ActionEvent e)
	{
		//Check if credit is more than 0 before every click.
		if (credit >= 0)
		{
			if (e.getActionCommand().equals("Top-up 10 euro."))
			{
				credit = credit + 10;
				amountLabel.setText(String.valueOf(credit));
			}
			else if (e.getActionCommand().equals("Top-up 20 euro."))
			{
				credit = credit + 20;
				amountLabel.setText(String.valueOf(credit));
			}
			else if (e.getActionCommand().equals("Top-up 30 euro."))
			{
				credit = credit + 30;
				amountLabel.setText(String.valueOf(credit));
			}
			else if (e.getActionCommand().equals("Make a call(2 euro)."))
			{
				credit = credit - 2;
				amountLabel.setText(String.valueOf(credit));
			}
			else if (e.getActionCommand().equals("Send a text(1 euro)."))
			{
				credit = credit - 1;
				amountLabel.setText(String.valueOf(credit));
			}
		}
		//Account terminated if ammount < 0.
		else if (credit < 0)
		{
			Font negativeFont = new Font("SansSerif", Font.ITALIC, 15);
			amountLabel.setFont(negativeFont);
			amountLabel.setText("Balance negative.");
			amountPanel.setBackground(Color.RED);
			credit = -1;
		}

	}

}