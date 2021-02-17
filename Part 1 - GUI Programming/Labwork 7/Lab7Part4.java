import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Lab7Part4 extends JFrame implements ActionListener, ItemListener
{
	//PANELONE_____________________________________________________
	//Create question label for panelOne.
	JLabel label1 = new JLabel("Pick your favourite color tone: ");
	//Create radiobuttons for panelOne.
	JRadioButton radio11 = new JRadioButton("Light");
	JRadioButton radio12 = new JRadioButton("Normal");
	JRadioButton radio13 = new JRadioButton("Dark");
	//Create buttongroup for panelOne, limiting user to only have one option.
	ButtonGroup groupOne = new ButtonGroup();
	//_____________________________________________________________
	//PANELTWO_____________________________________________________
	//Create question label for panelTwo.
	JLabel label2 = new JLabel("Pick your favourite color: ");
	//Create radiobuttons for panelTwo.
	JRadioButton radio21 = new JRadioButton("Red");
	JRadioButton radio22 = new JRadioButton("Green");
	JRadioButton radio23 = new JRadioButton("Blue");
	//Create buttongroup for panelTwo, limiting user to only have one option.
	ButtonGroup groupTwo = new ButtonGroup();
	//_____________________________________________________________
	//PANELTHREE___________________________________________________
	//Create question label for panelThree.
	JLabel label3 = new JLabel("Pick your favourite car brand: ");
	//Create radiobuttons for panelThree.
	JRadioButton radio31 = new JRadioButton("Nissan");
	JRadioButton radio32 = new JRadioButton("Honda");
	JRadioButton radio33 = new JRadioButton("Mitsubishi");
	//Create images for panelThree.
	ImageIcon nissanBG = new ImageIcon("nissan.jpg");
	ImageIcon hondaBG = new ImageIcon("honda.jpg");
	ImageIcon mitsubishiBG = new ImageIcon("mitsubishi.jpg");
	//Cretae labels to store image for panelThree.
	JLabel label31 = new JLabel("");
	JLabel label32 = new JLabel("");
	JLabel label33 = new JLabel("");
	//Create buttongroup for panelThree, limiting user to only have one option.
	ButtonGroup groupThree = new ButtonGroup();
	//_____________________________________________________________
	//PANELFOUR____________________________________________________
	//Create labels for panelFour.
	JLabel label40 = new JLabel("User prefers to have a");
	JLabel label41 = new JLabel("");
	JLabel label42 = new JLabel("");
	JLabel label43 = new JLabel("");
	//String to store user options.
	//_____________________________________________________________


	//Calls functions to build panels.
	JPanel panelOne = buildPanelOne();
	JPanel panelTwo = buildPanelTwo();
	JPanel panelThree = buildPanelThree();
	JPanel panelFour = buildPanelFour();

	//Base panel for card layout.
	JPanel basePanel = new JPanel();

	//Create button for changing cards.
	public JButton nextButton = new JButton("Next survey ->");

	public Lab7Part4()
	{
		super("Lab7Part4");

		//Set card layout for basePanel.
		basePanel.setLayout(new CardLayout());

		//Add panels to basePanel for switch.
		basePanel.add(panelOne);
		basePanel.add(panelTwo);
		basePanel.add(panelThree);
		basePanel.add(panelFour);

		//Add listeners to radio buttons.
		radio11.addItemListener(this);
		radio12.addItemListener(this);
		radio13.addItemListener(this);
		radio21.addItemListener(this);
		radio22.addItemListener(this);
		radio23.addItemListener(this);
		radio31.addItemListener(this);
		radio32.addItemListener(this);
		radio33.addItemListener(this);

		//Add listeners for both buttons.
		nextButton.addActionListener(this);

		//Add basePanel to contentpane.
		getContentPane().add(basePanel, BorderLayout.NORTH);
		//Add both buttons to contentpane.
		getContentPane().add(nextButton, BorderLayout.SOUTH);

		//Set frame size and visibility.
		setSize(200,620);
		setVisible(true);
	}

	//Build panelOne to add to card.
	public JPanel buildPanelOne()
	{
		//Create panel.
		JPanel panel = null;
		panel = new JPanel();
		//Verticalize the panel.
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));

		//Add radiobuttons to buttongroup.
		groupOne.add(radio11);
		groupOne.add(radio12);
		groupOne.add(radio13);
		//Add radiobuttons to panel.
		panel.add(label1);
		panel.add(radio11);
		panel.add(radio12);
		panel.add(radio13);

		//Returns completed panel.
		return panel;
	}

	//Build panelTwo to add to card.
	public JPanel buildPanelTwo()
	{
		//Create panel.
		JPanel panel = null;
		panel = new JPanel();
		//Verticalize the panel.
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));

		//Add radiobuttons to buttongroup.
		groupOne.add(radio21);
		groupOne.add(radio22);
		groupOne.add(radio23);
		//Add radiobuttons to panel.
		panel.add(label2);
		panel.add(radio21);
		panel.add(radio22);
		panel.add(radio23);

		//Returns completed panel.
		return panel;
	}

	//Build panelThree to add to card.
	public JPanel buildPanelThree()
	{
		//Create panel.
		JPanel panel = null;
		panel = new JPanel();
		//Verticalize the panel.
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));

		//Set image to labels.
		label31.setIcon(nissanBG);
		label32.setIcon(hondaBG);
		label33.setIcon(mitsubishiBG);

		//Add radiobuttons to buttongroup.
		groupOne.add(radio31);
		groupOne.add(radio32);
		groupOne.add(radio33);
		//Add radiobuttons to panel.
		panel.add(label3);
		panel.add(radio31);
		panel.add(label31);
		panel.add(radio32);
		panel.add(label32);
		panel.add(radio33);
		panel.add(label33);

		//Returns completed panel.
		return panel;
	}

	public JPanel buildPanelFour()
	{
		//Create panel.
		JPanel panel = null;
		panel = new JPanel();
		//Verticalize the panel.
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));

		panel.add(label40);
		panel.add(label41);
		panel.add(label42);
		panel.add(label43);

		//Returns completed panel.
		return panel;
	}

	public void actionPerformed(ActionEvent e)
	{
		//Get the card layout from the basePanel.
		CardLayout card = (CardLayout)basePanel.getLayout();

		//Swith cards in card layout.
		card.next(basePanel);
	}

	public void itemStateChanged(ItemEvent e)
	{
		//For panelOne.
        if(e.getSource()==radio11)
        {
            label41.setText("Light");
		}
        else if(e.getSource()==radio12)
        {
            label41.setText("Normal");
		}
        else if(e.getSource()==radio13)
        {
            label41.setText("Dark");
		}
		//For panelTwo.
        if(e.getSource()==radio21)
        {
            label42.setText("Red");
		}
        else if(e.getSource()==radio22)
        {
            label42.setText("Green");
		}
        else if(e.getSource()==radio23)
        {
            label42.setText("Blue");
		}
		//For panelThree.
        if(e.getSource()==radio31)
        {
            label43.setText("Nissan.");
		}
        else if(e.getSource()==radio32)
        {
            label43.setText("Honda.");
		}
        else if(e.getSource()==radio33)
        {
            label43.setText("Mitsubishi.");
		}
	}

	public static void main(String[] args)
	{
		new Lab7Part4();
	}
}
