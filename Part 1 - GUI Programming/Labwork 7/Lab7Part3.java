import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JSlider;

public class Lab7Part3 extends JFrame implements ChangeListener
{
	//Create two panels.
	JPanel volumePanel = new JPanel();
	JPanel balancePanel = new JPanel();

	//Create two labels.
	JLabel volumeLabel = new JLabel("Volume: 30");
	JLabel balanceLabel = new JLabel("Balance: 5");

	//Create two sliders.
	JSlider volumeSlider = new JSlider();
	JSlider balanceSlider = new JSlider();

	public Lab7Part3()
	{
		//Set min and max values for sliders.
		volumeSlider.setMaximum(30);
		volumeSlider.setMinimum(0);
		balanceSlider.setMaximum(5);
		balanceSlider.setMinimum(-5);

		//Add listeners to sliders to keep track of slider change.
		volumeSlider.addChangeListener(this);
		balanceSlider.addChangeListener(this);

		//Add components to panels.
		volumePanel.add(volumeLabel);
		volumePanel.add(volumeSlider);
		balancePanel.add(balanceLabel);
		balancePanel.add(balanceSlider);

		//Add panels to contentpane.
		getContentPane().add(volumePanel, BorderLayout.NORTH);
		getContentPane().add(balancePanel, BorderLayout.SOUTH);

		//Set frame size and visibility.
		setSize(300,200);
		setVisible(true);
	}

	public void stateChanged(ChangeEvent e)
	{
		volumeLabel.setText("Volume: " + volumeSlider.getValue());
		balanceLabel.setText("Balance: " + balanceSlider.getValue());
	}

	public static void main(String[] args)
	{
		new Lab7Part3();
	}


}
