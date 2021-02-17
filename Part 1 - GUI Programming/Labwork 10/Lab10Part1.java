import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab10Part1 extends JFrame
{
   public Lab10Part1()
   {
      super("Lab10Part1");

      setSize(400, 400);
      setVisible(true);
   }

   public void paint(Graphics g)
   {
      super.paint(g);
      g.drawLine(100, 100, 100, 200);
      g.drawLine(100, 200, 200, 200);
      g.drawLine(200, 100, 250, 150);
      g.drawLine(300, 100, 250, 150);
      g.drawLine(250, 150, 250, 200);

   }

   public static void main(String args[])
   {
	   new Lab10Part1();
   }

}