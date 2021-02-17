import javax.swing.*;
import java.awt.*;

public class Lab4Part4 extends JFrame
{
	public Lab4Part4()
	{
		super("Lab4Part4");

	 	Container contentPane = getContentPane();
	  	JPanel myPanel = new JPanel();

		//Add Corgi image as icon.
		ImageIcon corgiIcon = new ImageIcon("corgi.jpg");
		//Transform icon to image for scaling.
		Image corgiImage = corgiIcon.getImage();
		//Scale the image.
		Image corgiImage2 = corgiImage.getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH);
		//Revert scaled image back to original icon.
		corgiIcon = new ImageIcon(corgiImage2);
		//Create JLabel to contain image(as icon).
		JLabel corgiLabel = new JLabel();
		//Contain the icon.
		corgiLabel.setIcon(corgiIcon);
		corgiLabel.setText("That's Marchie over there, a beautiful Corgi.");

		//Add Chevrolet image, use JLabel to contain image.
		ImageIcon chevroletIcon = new ImageIcon("chevrolet.jpg");
		Image chevroletImage = chevroletIcon.getImage();
		Image chevroletImage2 = chevroletImage.getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH);
		chevroletIcon = new ImageIcon(chevroletImage2);
		JLabel chevroletLabel = new JLabel();
		chevroletLabel.setIcon(chevroletIcon);
		chevroletLabel.setText("Chevrolet Chevelle rocks, call mine the Blink.");

		//Add Jersey image, use JLabel to contain image.
		ImageIcon jerseyIcon = new ImageIcon("jersey.jpg");
		Image jerseyImage = jerseyIcon.getImage();
		Image jerseyImage2 = jerseyImage.getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH);
		jerseyIcon = new ImageIcon(jerseyImage2);
		JLabel jerseyLabel = new JLabel();
		jerseyLabel.setIcon(jerseyIcon);
		jerseyLabel.setText("D'Angelo Russell's jersey's my all-time favourite.");


	  	//Set locations for components.

	  	corgiLabel.setHorizontalTextPosition(JLabel.CENTER);
	  	corgiLabel.setVerticalTextPosition(JLabel.BOTTOM);
		myPanel.add(corgiLabel);
		corgiLabel.setHorizontalAlignment(JLabel.LEFT);
	  	corgiLabel.setVerticalAlignment(JLabel.CENTER);

	  	chevroletLabel.setHorizontalTextPosition(JLabel.CENTER);
	  	chevroletLabel.setVerticalTextPosition(JLabel.BOTTOM);
	  	myPanel.add(chevroletLabel);

	  	jerseyLabel.setHorizontalTextPosition(JLabel.CENTER);
	  	jerseyLabel.setVerticalTextPosition(JLabel.BOTTOM);
	  	myPanel.add(jerseyLabel);


	  	contentPane.add(myPanel);

		//Set frame size and visibility.
		setSize(1000,400);
		setVisible( true );
	}


	public static void main(String args [])
	{
		Lab4Part4 openFrame = new Lab4Part4();
		openFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}
}