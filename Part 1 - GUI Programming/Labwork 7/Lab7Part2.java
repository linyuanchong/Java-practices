import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JButton;

public class Lab7Part2 extends JFrame implements ActionListener
{
	//Array for list and combobox.
	public String[] shoesArray = {"Adidas", "Nike", "Reebok", "Anta", "Jordan", "Vans", "Converse", "Puma"};

	//Calls functions to build panels.
	JPanel listPanel = buildListPanel();
	JPanel boxPanel = buildBoxPanel();
	//Base panel for card layout.
	JPanel basePanel = new JPanel();

	public JButton switchToList = new JButton("Switch to list.");
	public JButton switchToBox = new JButton("Switch to box.");

	public Lab7Part2()
	{
		super("Lab7Part2");

		//Set card layout for basePanel.
		basePanel.setLayout(new CardLayout());

		//Add panels to basePanel for switch.
		basePanel.add(listPanel);
		basePanel.add(boxPanel);

		//Add listeners for both buttons.
		switchToList.addActionListener(this);
		switchToBox.addActionListener(this);

		//Add basePanel to contentpane.
		getContentPane().add(basePanel, BorderLayout.CENTER);
		//Add both buttons to contentpane.
		getContentPane().add(switchToList, BorderLayout.WEST);
		getContentPane().add(switchToBox, BorderLayout.EAST);

		//Set frame size and visibility.
		setSize(500,300);
		setVisible(true);
	}

	//Build first panel(list) to add to card.
	public JPanel buildListPanel()
	{
		//Create panel.
		JPanel panel = null;
		panel = new JPanel();
		//Create list.
		JList<String> shoesList = new JList<String>(shoesArray);
		panel.add(shoesList);
		//Returns completed panel.
		return panel;
	}

	//Build second panel(combobox) to add to card.
	public JPanel buildBoxPanel()
	{
		//Create panel.
		JPanel panel = null;
		panel = new JPanel();
		//Create comboBox.
		JComboBox<String> shoesBox = new JComboBox<String>(shoesArray);
		panel.add(shoesBox);
		//Returns completed panel.
		return panel;
	}

	public void actionPerformed(ActionEvent e)
	{
		//Get the card layout from the basePanel.
		CardLayout card = (CardLayout)basePanel.getLayout();

		//Swith cards in card layout.
		card.next(basePanel);
	}

	public static void main(String[] args)
	{
		new Lab7Part2();
	}
}
