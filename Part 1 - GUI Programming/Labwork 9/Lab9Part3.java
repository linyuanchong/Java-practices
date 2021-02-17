import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.event.*;

public class Lab9Part3 extends JFrame implements ActionListener
{
	//Panel, label, text area & scroll.
	JPanel myPanel = new JPanel();
	JLabel myLabel = new JLabel();
	JTextArea myText = new JTextArea("(News will appear here.)");
	JScrollPane myScroll = new JScrollPane(myText);

	//Create menu bar (empty).
	JMenuBar myMb = new JMenuBar();

	//Create menus.
	JMenu newsMenu = new JMenu("News");

	JMenuItem sport = new JMenuItem("Sport News");
	JMenuItem media = new JMenuItem("Media News");
	JMenuItem weather = new JMenuItem("Weather");

	public Lab9Part3()
	{
		super("Lab9Part3");

		//Add items to newsMenu.
		newsMenu.add(sport);
		newsMenu.add(media);
		newsMenu.add(weather);

		//Setting mnemonic (ALT + *).
		sport.setMnemonic('S');
		media.setMnemonic('M');
		weather.setMnemonic('W');
		//Setting accelerator (CTRL + *).
		sport.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S , ActionEvent.CTRL_MASK));
		media.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M , ActionEvent.CTRL_MASK));
		weather.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W , ActionEvent.CTRL_MASK));

		//Add listener to menu.
		sport.addActionListener(this);
		media.addActionListener(this);
		weather.addActionListener(this);

		//Add menus to menu bar.
		myMb.add(newsMenu);

		//Add label to panel.
		myPanel.add(myLabel);
		myPanel.add(myText);

		//Add scroller to text area.
		myText.add(myScroll);

		//Set menu bar.
		setJMenuBar(myMb);

		getContentPane().add(myPanel);

        setSize(300,300);
        setVisible(true);
   }


   public static void main(String[] args)
   {
	   new Lab9Part3();
   }

   public void actionPerformed(ActionEvent e)
   {
	   if(e.getSource().equals(sport))
	   {
			ImageIcon sportIcon = new ImageIcon("sport.jpg");
	   		myLabel.setIcon(sportIcon);
	   		myText.setText("Luka Doncic dropped 40 points tonight.");
	   }
	   else if(e.getSource().equals(media))
	   {
			ImageIcon mediaIcon = new ImageIcon("media.jpg");
	   		myLabel.setIcon(mediaIcon);
	   		myText.setText("Juice Wrld releasing new album in 3 days.");
	   }
	   else if(e.getSource().equals(weather))
	   {
			ImageIcon weatherIcon = new ImageIcon("weather.jpg");
	   		myLabel.setIcon(weatherIcon);
	   		myText.setText("Hurricane expected to hit shores by next Monday.");
	   }

   }
}


