import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Lab9Part2 extends JFrame
{
	JPanel myPanel = new JPanel();

	//Create menu bar (empty).
	JMenuBar myMb = new JMenuBar();

	//Create menus.
	JMenu funcMenu = new JMenu("Functions");
	JMenu langMenu = new JMenu("Languages");

	JMenuItem rename = new JMenuItem("Rename");
	JMenuItem delete = new JMenuItem("Delete");

	JMenu chineseItem = new JMenu("Chinese");
	JMenuItem englishItem = new JMenuItem("English");

	JMenuItem trad = new JMenuItem("Traditional Chinese");
	JMenuItem simp = new JMenuItem("Simplified Chinese");

	//Icons for menu.
	ImageIcon imageIcon = new ImageIcon();

	public Lab9Part2()
	{
		super("Lab9Part2");

		//Add items to funcMenu.
		funcMenu.add(rename);
		funcMenu.add(delete);
		//Add items to langMenu.
		langMenu.add(chineseItem);
		langMenu.add(englishItem);
		//Add submenus.
		chineseItem.add(trad);
		chineseItem.add(simp);
		//Set icons for langMenu items.
		chineseItem.setIcon(new ImageIcon("C.png"));
		englishItem.setIcon(new ImageIcon("E.png"));
		//Add menus to menu bar.
		myMb.add(funcMenu);
		myMb.add(langMenu);

		//Set menu bar.
		setJMenuBar(myMb);

        setSize(300,300);
        setVisible(true);
   }


   public static void main(String[] args)
   {
	   new Lab9Part2();
   }
}


