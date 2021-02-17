import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab10Part3 extends JFrame
{
	//Edit these values to edit all.
	int x = 10;
	int y = 10;

	public Lab10Part3()
   	{
		super("Lab10Part2");

		setSize(400, 400);
		setVisible(true);
    }

	public void paint(Graphics g)
   	{
      	super.paint(g);

		//Dip blue.
		g.setColor(Color.BLUE);
		//Draw first boat.
		Draw(g, x, y);

		//Dip red.
		g.setColor(Color.RED);
		//Draw second boat.
		Draw(g, x, y+200);
   	}

	public static void main(String args[])
	{
		new Lab10Part3();
	}

	public void Draw(Graphics g, int x, int y)
	{
		g.drawLine(x+190, y+40, x+140, y+90);
		g.drawLine(x+190, y+40, x+240, y+90);

		//X coordinates for boat body.
		int xValue[] = {x+90, x+140, x+240, x+290};
		//Y coordinates for boat body.
		int yValue[] = {y+90, y+140, y+140, y+90};

		Polygon boat = new Polygon(xValue, yValue, 4);
		g.fillPolygon(boat);
	}
}