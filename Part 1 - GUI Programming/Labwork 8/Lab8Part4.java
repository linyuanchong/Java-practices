import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;
import java.io.File;

import java.awt.*;
import java.awt.event.*;

public class Lab8Part4 extends JFrame implements MouseInputListener, MouseMotionListener
{
	//For displaying file chooser.
	JPanel filePanel = new JPanel();

	//Create panels.
	JPanel basePanel = new JPanel();
	JPanel leftTop = new JPanel();
	JPanel rightTop = new JPanel();
	JPanel leftBottom = new JPanel();
	JPanel rightBottom = new JPanel();

	//Create labels for panels.
	JLabel imageLabel = new JLabel("File Chooser");
	JLabel colorLabel = new JLabel("Color Chooser");
	JLabel locationLabel = new JLabel("Location Detector");
	JLabel infoLabel = new JLabel("");

	public Lab8Part4()
	{
		basePanel.setLayout(new GridLayout(2, 2));

		//Add mouse listener to panels.
		basePanel.addMouseListener(this);
		basePanel.addMouseMotionListener(this);
		leftTop.addMouseListener(this);
		leftTop.addMouseMotionListener(this);
		rightTop.addMouseListener(this);
		rightTop.addMouseMotionListener(this);
		leftBottom.addMouseListener(this);
		leftBottom.addMouseMotionListener(this);
		rightBottom.addMouseListener(this);
		rightBottom.addMouseMotionListener(this);

		//Add borders to panels.
		leftTop.setBorder(new LineBorder(Color.BLACK));
		rightTop.setBorder(new LineBorder(Color.BLACK));
		leftBottom.setBorder(new LineBorder(Color.BLACK));
		rightBottom.setBorder(new LineBorder(Color.BLACK));

		//Add labels to panels.
		leftTop.add(imageLabel, BorderLayout.CENTER);
		rightTop.add(colorLabel, BorderLayout.CENTER);
		leftBottom.add(locationLabel, BorderLayout.CENTER);
		rightBottom.add(infoLabel, BorderLayout.CENTER);

		basePanel.add(leftTop);
		basePanel.add(rightTop);
		basePanel.add(leftBottom);
		basePanel.add(rightBottom);

		getContentPane().add(basePanel);

		setSize(500,500);
		setVisible(true);
	}

	public void mouseClicked(MouseEvent e)
	{
		if(e.getSource() == leftTop)
		{
			JFileChooser fileChooser = new JFileChooser();

			int optionVal=fileChooser.showOpenDialog(filePanel);

			if (optionVal == JFileChooser.APPROVE_OPTION)
			{
				//Clears the original text of label.
				imageLabel.setText("");
				//Stores the selected file.
	            File chosenFile = fileChooser.getSelectedFile();

				//Add image as icon.
				ImageIcon selectedIcon = new ImageIcon(chosenFile.getName());
				//Transform icon to image for scaling.
				Image selectedImage = selectedIcon.getImage();
				//Scale the image.
				Image selectedImage2 = selectedImage.getScaledInstance(220, 220, java.awt.Image.SCALE_SMOOTH);
				//Revert scaled image back to original icon.
				selectedIcon = new ImageIcon(selectedImage2);

				//Set icon to label according to chosen file's name.
	            imageLabel.setIcon(selectedIcon);
	        }
	        else
	        {
	            System.out.println("No File");
	        }
		}
	}

	public void mouseEntered(MouseEvent e)
	{
		if(e.getSource() == rightTop)
		{
			//Launch color chooser and stores color.
			Color myColor = (new JColorChooser()).showDialog(rightTop, "Change panel color.", Color.BLACK);
			rightTop.setBackground(myColor);
		}
		else if(e.getSource() == rightBottom)
		{
			infoLabel.setText("Hello mouse!!!");
		}
	}

	public void mouseExited(MouseEvent e)
	{
		if(e.getSource() == rightBottom)
		{
			infoLabel.setText("Luch beannacht!!!");
		}
	}

	public void mousePressed(MouseEvent e)
	{
	}

	public void mouseReleased(MouseEvent e)
	{
	}

	public void mouseDragged(MouseEvent e)
	{
		locationLabel.setText(e.getXOnScreen() + " " + e.getYOnScreen());
	}

	public void mouseMoved(MouseEvent e)
	{
	}

	public static void main (String[] args)
	{
		new Lab8Part4();
	}
}

