import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author linyu
 *
 */
public class TestFourExceptionsGUI extends JFrame implements ActionListener
{
	//Create buttons.
	JButton testio = new JButton("Test IO Exception.");
	JButton testurl = new JButton("Test URL Exception.");
	JButton testnull = new JButton("Test Null Pointer Exception.");
	JButton testgeneral = new JButton("Test General Exception.");

	//Variables.
	public String str = "someString";
	public String filename = "fake.txt";
	public String url = "someUrl";
	public boolean generalExceptionActivated = false;
	
	/**
	 * 
	 */
	public TestFourExceptionsGUI()
	{
		super("TestFourExceptionsGUI");
		
		GridLayout myGrid = new GridLayout(2, 2);
		
		//Create JPanel.
		JPanel myPanel = new JPanel();
		myPanel.setLayout(myGrid);

		//Add action listeners to buttons.
		testio.addActionListener(this);
		testurl.addActionListener(this);
		testnull.addActionListener(this);
		testgeneral.addActionListener(this);

		//Add items to panel.
		myPanel.add(testio);
		myPanel.add(testurl);
		myPanel.add(testnull);
		myPanel.add(testgeneral);


		//Add panel to contentpane.
	  	getContentPane().add(myPanel);

		//Set frame size and visibility.
		setSize(500,200);
		setVisible(true);
	}


	/**
	 * @param args
	 */
	public static void main(String args []) {
		new TestFourExceptionsGUI();
	}
	
	/**
	 * @param str
	 * @param filename
	 * @param url
	 * @param generalExceptionActivated
	 */
	public void testException(String str, String filename, String url, boolean generalExceptionActivated) {
		//Try block.
		try {
			//Null string potential error.
			str.toCharArray(); 
			//Unknown filename potential error.
			new FileReader(filename); 
			//Badly written URL potential error.
			new URL(url); 
			//Potential general error.
			if(generalExceptionActivated) { 
				//Will be caught as a general error!
				this.clone(); 
			}
		}
		
		//Catch blocks.
		//___________________________________________________________________________________________
		//Catches nullPointer exceptions.
		catch (NullPointerException e) {
			System.out.println("A null object has been passed to the method." + e.getMessage());
		}
		//Catches badURL exceptions.
		catch(MalformedURLException e) {
			System.out.println("The URL passed is not correctly formatted." + e.getMessage());
		}
		//Catches IO exceptions.
		catch(IOException e) {
			System.out.println("There has been an input/output error." + e.getMessage());
		}
		//Catches general exceptions.
		catch(Exception e) {
			System.out.println("An unidentified error has occured." + e.getMessage());
		}
		//___________________________________________________________________________________________
		
		//Finally block.
		finally {
			System.out.println("The finally block has been called.");
		}
	}

	//Listener.
	/**
	 *
	 */
	public void actionPerformed(ActionEvent e)
	{
		//IO pressed.
		if (e.getSource() == testio) {
			String str = "Hi";
			String filename = "Whatever.txt";
			String url = "http://www.itb.ie";
			boolean generalExceptionActivated = false;
			testException(str, filename, url, generalExceptionActivated);
		}
		//Null Pointer pressed.
		if (e.getSource() == testnull) {
			String str = null;
			String filename = "Real.txt";
			String url = "http://www.itb.ie";
			boolean generalExceptionActivated = false;
			testException(str, filename, url, generalExceptionActivated);
		}
		//URL pressed.
		if (e.getSource() == testurl) {
			String str = "Hi";
			String filename = "Real.txt";
			String url = "ht//www.itb.ie";
			boolean generalExceptionActivated = false;
			testException(str, filename, url, generalExceptionActivated);
		}
		//General pressed.
		if (e.getSource() == testgeneral) {
			String str = "Hi";
			String filename = "Real.txt";
			String url = "http://www.itb.ie";
			boolean generalExceptionActivated = true;
			testException(str, filename, url, generalExceptionActivated);
		}
		
	}

}