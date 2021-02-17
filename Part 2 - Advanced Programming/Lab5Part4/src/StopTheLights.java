import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StopTheLights extends JFrame implements ActionListener {
	
	//For circles.
	//Circle X coordinates.
	int cOneX = 100;
	int cTwoX = 200;
	int cThreeX = 300;
	//Circle Y coordinates.
	int cY = 100;
	//Circle size.
	int sizex = 50;
	int sizey = 50;
	
	//Components.
	public JButton startButton = new JButton("Start");
	public JButton stopButton = new JButton("Stop");
	public JPanel drawPanel= new JPanel();
	public JPanel buttonPanel = new JPanel();
	
	//Booleans.
	public boolean drawCheck = false;

	public StopTheLights()
   	{
		super("StopTheLights");
		
		startButton.addActionListener(this);
		stopButton.addActionListener(this);
		
		buttonPanel.add(startButton, BorderLayout.WEST);
		buttonPanel.add(stopButton, BorderLayout.EAST);
		getContentPane().add(buttonPanel, BorderLayout.SOUTH);
		
		setSize(450, 250);
		setVisible(true);
    }
	
	public static void main(String args[])
	{
		new StopTheLights();
	}
	
	public void actionPerformed(ActionEvent e) {
		Graphics g = getGraphics();
		if (e.getSource() == startButton) {
			DrawRed(g);
			DrawOrange(g);
			DrawGreen(g);
		}
	}
	
	//Method to draw red.
	public void DrawRed(Graphics g)
	{
		g.setColor(Color.RED);
		g.fillOval(cOneX, cY, sizex, sizey);
	}
	
	//Method to draw orage.
	public void DrawOrange(Graphics g)
	{
		g.setColor(Color.ORANGE);
		g.fillOval(cTwoX, cY, sizex, sizey);
	}
	
	//Method to draw green.
	public void DrawGreen(Graphics g)
	{
		g.setColor(Color.GREEN);
		g.fillOval(cThreeX, cY, sizex, sizey);
	}
}