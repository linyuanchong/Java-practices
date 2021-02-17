import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;

public class MyAlbum extends JFrame implements ActionListener { 
	
	//Vector for artist.
	Vector<FavouriteArtist> artistVector = new Vector<FavouriteArtist>(2);
	//3 artist objects.
	FavouriteArtist artist1 = new FavouriteArtist("artist1", "Juice Wrld", 20, "Lucid Dreams");
	FavouriteArtist artist2 = new FavouriteArtist("artist2", "Bruno Mars", 34, "Grenade");
	FavouriteArtist artist3 = new FavouriteArtist("artist3", "Joji", 27, "Sanctuary");
	
	//Vector for shoe.
	Vector<FavouriteShoe> shoeVector = new Vector<FavouriteShoe>(2);
	//3 shoe objects.
	FavouriteShoe shoe1 = new FavouriteShoe("shoe1", "Air Presto", 7, "white");
	FavouriteShoe shoe2 = new FavouriteShoe("shoe2", "Dame 6", 8, "black");
	FavouriteShoe shoe3 = new FavouriteShoe("shoe3", "Jordan Denims", 7, "blue");
	
	//GUI Components.
	JButton myButton = new JButton("Next");
	JLabel myLabel = new JLabel();
	
	public int i = 0;
	public boolean switcher = true;
	
	public MyAlbum() {
		
		super("Lab8Part3");
		
		//Adding objects to vector.
		artistVector.add(artist1);
		artistVector.add(artist2);
		artistVector.add(artist3);
		shoeVector.add(shoe1);
		shoeVector.add(shoe2);
		shoeVector.add(shoe3);
		
		myButton.addActionListener(this);
		
		//Set label position.
		myLabel.setHorizontalTextPosition(JLabel.CENTER);
	  	myLabel.setVerticalTextPosition(JLabel.BOTTOM);
		
		getContentPane().setLayout(new GridLayout(2,1));
		getContentPane().add(myLabel);
		getContentPane().add(myButton);
		
		setSize(500, 700);
		setVisible(true);	
		
	}

	public static void main(String[] args) {
		new MyAlbum();
	}

	
	public void actionPerformed(ActionEvent e) {
		
		if (i == 3) {
			i = 0;
			switcher = false;
		}
		
		//Shuffle images and labels.
		if (switcher == true) {
			ImageIcon shoeIcon = new ImageIcon((shoeVector.elementAt(i).getImage()) + ".PNG");
			myLabel.setIcon(shoeIcon);
			myLabel.setText((shoeVector.elementAt(i).getFacts()));
		}
		
		if (switcher == false) {
			ImageIcon artistIcon = new ImageIcon((artistVector.elementAt(i).getImage()) + ".PNG");
			myLabel.setIcon(artistIcon);
			myLabel.setText((artistVector.elementAt(i).getFacts()));
		}
		

		i = i + 1;


	}

}
