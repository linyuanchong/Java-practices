import javax.swing.*;
import java.awt.*;

public class Lab5Part3 extends JFrame
{
	Container contentPane = getContentPane();

	//First JComboBox.
	String[] carArray = {"Chevrolet", "Ford", "Mercedes-Benz", "Mitsubishi"};
	JComboBox<String> car = new JComboBox<String>(carArray);
	//Second JComboBox (tried to set editable but failed).
	String[] artistArray = {"Juice Wrld", "Swae Lee", "NF", "Joji"};
	JComboBox<String> artist = new JComboBox<String>(artistArray);
	JPanel myPanel = new JPanel();
	JPanel carPanel = new JPanel();
	JPanel artistPanel = new JPanel();

	public Lab5Part3()
	{
		carPanel.add(car);
		artistPanel.add(artist);

		contentPane.add(carPanel, BorderLayout.NORTH);
		contentPane.add(artistPanel, BorderLayout.SOUTH);

		setSize(200,200);
		setVisible( true );
	}

	public static void main(String args [])
	{
		Lab5Part3 openFrame = new Lab5Part3();
		openFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}




}