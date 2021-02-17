import javax.swing.*;
import java.awt.*;

public class Lab5Part4 extends JFrame
{
	public Lab5Part4()
	{
		super("Lab5Part4");

	 	Container contentPane = getContentPane();

	 	//Create 3 panels for buttons and 2 text fields.
	 	JPanel myPanel = new JPanel();
	 	JPanel fontPanel1 = new JPanel();
	 	JPanel fontPanel2 = new JPanel();

	 	//Set grid layout for myPanel.
	 	myPanel.setLayout(new GridLayout(3, 2));

	 	//Set colour for text panels.
	 	fontPanel1.setBackground(Color.BLUE);
	 	fontPanel2.setBackground(Color.CYAN);

		//Add image as button's icon.
		ImageIcon buttonBG = new ImageIcon("button.png");
		//Transform icon to image for scaling.
		Image buttonImage = buttonBG.getImage();
		//Scale the image.
		Image buttonImage2 = buttonImage.getScaledInstance(100, 30, java.awt.Image.SCALE_SMOOTH);
		//Revert scaled image back to original icon.
		buttonBG = new ImageIcon(buttonImage2);

		//Create label.
		JLabel fontLabel1 = new JLabel("~ Welcome to JBank ~");
   	 	//Create fonts.
   		Font welcomeFont = new Font("Helvetica", Font.BOLD, 32);
    	//Put fonts on label.
    	fontLabel1.setFont(welcomeFont);
		//Put label on panel.
    	fontPanel1.add(fontLabel1);

  		JLabel fontLabel2 = new JLabel("Please select option:");
     	//Create fonts.
     	Font instructionsFont = new Font("Times New Roman", Font.ITALIC, 15);
      	//Put fonts on label.
      	fontLabel2.setFont(instructionsFont);
  		//Put label on panel.
    	fontPanel2.add(fontLabel2);

		//Adjusting button icons for Jbuttons.
		JButton button1 = new JButton("FAST CASH", buttonBG);
		button1.setHorizontalTextPosition(JButton.CENTER);
		button1.setVerticalTextPosition(JButton.CENTER);

		JButton button2 = new JButton("WITHDRAWAL", buttonBG);
		button2.setHorizontalTextPosition(JButton.CENTER);
		button2.setVerticalTextPosition(JButton.CENTER);

		JButton button3 = new JButton("BALANCE", buttonBG);
		button3.setHorizontalTextPosition(JButton.CENTER);
		button3.setVerticalTextPosition(JButton.CENTER);

		JButton button4 = new JButton("SERVICES", buttonBG);
		button4.setHorizontalTextPosition(JButton.CENTER);
		button4.setVerticalTextPosition(JButton.CENTER);

		JButton button5 = new JButton("PAYMENTS", buttonBG);
		button5.setHorizontalTextPosition(JButton.CENTER);
		button5.setVerticalTextPosition(JButton.CENTER);

		JButton button6 = new JButton("TRANSFER", buttonBG);
		button6.setHorizontalTextPosition(JButton.CENTER);
		button6.setVerticalTextPosition(JButton.CENTER);

		//Add buttons.
		myPanel.add(button1);
		myPanel.add(button2);
		myPanel.add(button3);
		myPanel.add(button4);
		myPanel.add(button5);
		myPanel.add(button6);

		//Adjusting panel locations.
	  	contentPane.add(myPanel, BorderLayout.NORTH);
	  	contentPane.add(fontPanel1, BorderLayout.SOUTH);
	  	contentPane.add(fontPanel2, BorderLayout.CENTER);

		//Set frame size and visibility.
		setSize(500,300);
		setVisible( true );

	}


	public static void main(String args [])
	{
		Lab5Part4 openFrame = new Lab5Part4();
		openFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}

}