import javax.swing.*;
import java.awt.*;

public class Lab5Part2 extends JFrame
{
	Container contentPane = getContentPane();

	//Create String.
	String[] shopsArray = {"Adidas", "Nike", "Reebok", "Anta", "Jordan", "Vans", "Converse", "Puma"};
	//Create Jlist.
	JList<String> shopsList = new JList<String>(shopsArray);

	//Create Panel.
	JPanel myPanel = new JPanel();

	public Lab5Part2()
	{
		super("Lab5Part2");

		myPanel.add(shopsList);
		contentPane.add(myPanel, BorderLayout.NORTH);

		setSize(200,200);
		setVisible( true );
	}

	public static void main(String args [])
	{
		Lab5Part2 openFrame = new Lab5Part2();
		openFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}

}