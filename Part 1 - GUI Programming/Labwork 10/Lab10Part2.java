import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab10Part2 extends JFrame
{
	//Circle X coordinates.
	int cOneX = 140;
	int cTwoX = 110;
	int cThreeX = 100;
	//Circle Y coordinates.
	int cOneY = 150;
	int cTwoY = 168;
	int cThreeY = 200;
	int cFourY = 232;
	int cFiveY = 250;

	//Circle size.
	int sizex = 20;
	int sizey = 20;

	public Lab10Part2()
   	{
		super("Lab10Part2");

		setSize(400, 400);
		setVisible(true);
    }

	public void paint(Graphics g)
   	{
      	super.paint(g);

		//Draw left half.
		Draw(g);

		//Increase X axis for right half.
		cOneX = cOneX + 35;
		cTwoX = cTwoX + 95;
		cThreeX = cThreeX + 115;

		//Draw right half.
		Draw(g);
   	}

	public static void main(String args[])
	{
		new Lab10Part2();
	}

	public void Draw(Graphics g)
	{
		g.drawOval(cOneX, cOneY, sizex, sizey);
		g.drawOval(cTwoX, cTwoY, sizex, sizey);
		g.drawOval(cThreeX, cThreeY, sizex, sizey);
		g.drawOval(cTwoX, cFourY, sizex, sizey);
		g.drawOval(cOneX, cFiveY, sizex, sizey);
	}
}