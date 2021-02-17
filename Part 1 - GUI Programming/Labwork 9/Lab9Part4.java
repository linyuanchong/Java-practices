import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Lab9Part4 extends JFrame implements ActionListener
{
	JFrame myFrame = new JFrame("Lab9Part4");
	JPanel myPanel = new JPanel();
	JButton startButton = new JButton("Enter the dungeon");

	//Options.
	public String[] mainDoorOptions = {"Door of faith", "Door of brave", "Door of wisdom"};
	public String[] doorOneOptions = {"Kill it", "Pray", "Escape"};
	public String[] doorTwoOptions = {"Fight", "Defend", "Escape"};
	public String[] doorThreeOptions = {"Water ", "Ice", "Fire"};

	//Images.
	ImageIcon doorIcon = new ImageIcon("door.png");
	ImageIcon ghostIcon = new ImageIcon("ghost.png");
	ImageIcon giantIcon = new ImageIcon("giant.png");
	ImageIcon magmaIcon = new ImageIcon("magma.png");
	ImageIcon tombIcon = new ImageIcon("tomb.png");
	ImageIcon tickIcon = new ImageIcon("tick.png");
	ImageIcon stoneIcon = new ImageIcon("stone.png");
	ImageIcon skullIcon = new ImageIcon("skull.png");
	ImageIcon fireIcon = new ImageIcon("fire.png");

	public Lab9Part4()
	{
		myPanel.add(startButton);
		startButton.addActionListener(this);
		myFrame.add(myPanel);

        myFrame.setSize(300,100);
        myFrame.setVisible(true);
	}


	public static void main(String[] args)
	{
		new Lab9Part4();
	}

   	public void actionPerformed(ActionEvent e)
   	{
		int mainDoor = JOptionPane.showOptionDialog(myFrame,
													"Please choose a door.",
													"Door One.",
													JOptionPane.YES_NO_OPTION,
													JOptionPane.QUESTION_MESSAGE,
													doorIcon,
													mainDoorOptions,
													mainDoorOptions[0]);
//Door 1.
//____________________________________________________________________________________________________________________________________________________
		if (mainDoor == JOptionPane.YES_OPTION)
		{
			int doorOne1 = JOptionPane.showOptionDialog(myFrame,
			"Light shines upon you, the faithful one. A ghost is rushing towards you, what would you do?",
			"Door one - Level 1",
			JOptionPane.YES_NO_OPTION,
			JOptionPane.QUESTION_MESSAGE,
			ghostIcon,
			doorOneOptions,
			doorOneOptions[0]);

			if (doorOne1 == JOptionPane.YES_OPTION)
			{
				JOptionPane.showMessageDialog(myFrame,
				"really? 'Killing' a ghost? Ghost devoured your soul without hesitation.",
				"Game Over",
				JOptionPane.INFORMATION_MESSAGE,
				tombIcon);
			}
			else if (doorOne1 == JOptionPane.NO_OPTION)
			{
				int doorOne2 = JOptionPane.showOptionDialog(myFrame,
				"Your prayer worked. Ghost diminishes after your prayer. But the road forth is blocked by stones, do you still wanna venture forth?",
				"Door one - Level 2",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				stoneIcon,
				null,
				null);
				//Door 1-2.
				//____________________________________________________________________________________________________________________________________
				if(doorOne2 == JOptionPane.YES_OPTION)
				{
					JOptionPane.showMessageDialog(myFrame,
					"Your undying faith allows you to dig a way out, you win the game.",
					"Game Complete",
					JOptionPane.INFORMATION_MESSAGE,
					tickIcon);
				}
				else if(doorOne2 == JOptionPane.NO_OPTION)
				{
					JOptionPane.showMessageDialog(myFrame,
					"You let go of faith and game up, you starved to death in the dungeon after 3 weeks.",
					"Game Over",
					JOptionPane.INFORMATION_MESSAGE,
					tombIcon);
				}

			}
			else
			{
				JOptionPane.showMessageDialog(myFrame,
				"Escaping from fear will not cure your problems. Ghost caught you and brought you to the dark side.",
				"Game Over",
				JOptionPane.INFORMATION_MESSAGE,
				tombIcon);
			}
		}
//Door 2.
//____________________________________________________________________________________________________________________________________________________
		else if (mainDoor == JOptionPane.NO_OPTION)
		{
			int doorTwo1 = JOptionPane.showOptionDialog(myFrame,
			"Go fourth with courage my hero. A giant is stomping towards you, what would you do?",
			"Door two - Level 1.",
			JOptionPane.YES_NO_OPTION,
			JOptionPane.QUESTION_MESSAGE,
			giantIcon,
			doorTwoOptions,
			doorTwoOptions[0]);

			if (doorTwo1 == JOptionPane.YES_OPTION)
			{
				int doorTwo2 = JOptionPane.showOptionDialog(myFrame,
				"You fought bravely, giant killed. But a wall of fire appears in front of you, do you still wanna move forward?",
				"Door two - Level 2",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				fireIcon,
				null,
				null);
				//Door 2-2.
				//____________________________________________________________________________________________________________________________________
				if(doorTwo2 == JOptionPane.YES_OPTION)
				{
					JOptionPane.showMessageDialog(myFrame,
					"Turns out, the fire is just illusion, you walk through it and escaped the dungeon.",
					"Game Complete",
					JOptionPane.INFORMATION_MESSAGE,
					tickIcon);
				}
				else if(doorTwo2 == JOptionPane.NO_OPTION)
				{
					JOptionPane.showMessageDialog(myFrame,
					"You turned around and walk away, turns out the giant ain't dead yet, he ate you.",
					"Game Over",
					JOptionPane.INFORMATION_MESSAGE,
					tombIcon);
				}
			}
			else if (doorTwo1 == JOptionPane.NO_OPTION)
			{
				JOptionPane.showMessageDialog(myFrame,
				"Do nothing but defend can't defeat the giant, giant smashed you to death after his 3rd hit.",
				"Game Over",
				JOptionPane.INFORMATION_MESSAGE,
				tombIcon);
			}
			else
			{
				JOptionPane.showMessageDialog(myFrame,
				"You can't outrun the giant, giant took a step forward and have you dead under his feet.",
				"Game Over",
				JOptionPane.INFORMATION_MESSAGE,
				tombIcon);
			}
		}
//Door 3.
//____________________________________________________________________________________________________________________________________________________

		else
		{
			int doorThree1 = JOptionPane.showOptionDialog(myFrame,
			"March with wisdom, the wise one. The fiery magma rushes towards you, kill it with?",
			"Door three - Level 1.",
			JOptionPane.YES_NO_OPTION,
			JOptionPane.QUESTION_MESSAGE,
			magmaIcon,
			doorThreeOptions,
			doorThreeOptions[0]);

			if (doorThree1 == JOptionPane.YES_OPTION)
			{
				int doorThree2 = JOptionPane.showOptionDialog(myFrame,
				"Wise, water to put fire away of course, magma dead. You see the exit with skulls around, do you wanna head out anyway?",
				"Door two - Level 2",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				skullIcon,
				null,
				null);
				//Door 3-2.
				//____________________________________________________________________________________________________________________________________
				if(doorThree2 == JOptionPane.YES_OPTION)
				{
					JOptionPane.showMessageDialog(myFrame,
					"Those skulls are the proof of death of previous adventurers, the exit was a trap, not so wise anyway huh?",
					"Game Over",
					JOptionPane.INFORMATION_MESSAGE,
					tombIcon);
				}
				else if(doorThree2 == JOptionPane.NO_OPTION)
				{
					JOptionPane.showMessageDialog(myFrame,
					"You turned around and walk away the way you came in. Not the best way, but you still escaped the dungeon.",
					"Game Complete",
					JOptionPane.INFORMATION_MESSAGE,
					tickIcon);
				}
			}
			else if (doorThree1 == JOptionPane.NO_OPTION)
			{
				JOptionPane.showMessageDialog(myFrame,
				"Never thought ice can beat fire, magma burned you to death.",
				"Game Over",
				JOptionPane.INFORMATION_MESSAGE,
				tombIcon);
			}
			else
			{
				JOptionPane.showMessageDialog(myFrame,
				"Not so wise to beat fire with fire. Magma absorbed fire and killed you with a blow.",
				"Game Over",
				JOptionPane.INFORMATION_MESSAGE,
				tombIcon);
			}
		}
	}
}