import javax.swing.*;
import java.awt.*;

public class Lab5Part1 extends JFrame
{
	Container contentPane = getContentPane();

	JPanel myPanel = new JPanel();
	JPanel buttonPanel = new JPanel();
	JPanel namePanel = new JPanel();
	JPanel passPanel = new JPanel();
	JPanel mailPanel = new JPanel();

	//3 labels.
	JLabel nameLabel = new JLabel("Name: ");
	JLabel passLabel = new JLabel("Password: ");
	JLabel mailLabel = new JLabel("E-mail address: ");
	//3 fields.
	JTextField nameField = new JTextField(20);
	JPasswordField passField = new JPasswordField(20);
	JTextField mailField = new JTextField(20);
	//1 button.
	JButton joinButton = new JButton("JOIN!");


	public Lab5Part1()
	{
		super("Lab5Part1");

		namePanel.add(nameLabel);
		passPanel.add(passLabel);
		mailPanel.add(mailLabel);

		namePanel.add(nameField);
		passPanel.add(passField);
		mailPanel.add(mailField);

		buttonPanel.add(joinButton);

		myPanel.add(namePanel);
		myPanel.add(passPanel);
		myPanel.add(mailPanel);

		contentPane.add(myPanel);
		contentPane.add(buttonPanel, BorderLayout.SOUTH);

		setSize(400,200);
		setVisible( true );
	}

	public static void main(String args [])
	{
		Lab5Part1 openFrame = new Lab5Part1();
		openFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}

}