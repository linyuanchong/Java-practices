import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab10Part4 extends JFrame
{
	//Edit these values to edit all.
	int x = 10;
	int y = 10;

	//X cpprdinates for chair.
	int xChair[] = {250, 230, 220};
	//Y coordinates for chair.
	int yChair[] = {140, 160, 140};

	public Lab10Part4()
   	{
		super("Lab10Part2");

		setSize(400, 400);
		setVisible(true);
    }

	public void paint(Graphics g)
   	{
      	super.paint(g);

		//Draw back chassis.
		g.setColor(Color.MAGENTA);
		Draw(g, x, y);

		//Draw front chassis.
		g.setColor(Color.RED);
		Draw(g, x-20, y+20);

		//Draw chair.
		g.setColor(Color.BLACK);
		Polygon chair = new Polygon(xChair, yChair, 3);
		g.fillPolygon(chair);




   	}

	public static void main(String args[])
	{
		new Lab10Part4();
	}

	public void Draw(Graphics g, int x, int y)
	{
		//X coordinates for chassis.
		int xChassis[] = {x+90, x+120, x+300, x+290, x+240, x+220};
		//Y coordinates for chassis.
		int yChassis[] = {y+90, y+150, y+150, y+130, y+130, y+90};

		//Draw chassis.
		Polygon chassis = new Polygon(xChassis, yChassis, 6);
		g.fillPolygon(chassis);

		//Draw blade.
		g.setColor(Color.BLACK);
		g.drawLine(x+130, y+150, x+130, y+160);
		g.drawLine(x+280, y+150, x+280, y+160);
		g.drawLine(x+120, y+160, x+290, y+160);
	}
}