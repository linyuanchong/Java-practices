import javax.swing.*;
import java.awt.*;

public class FavouriteShoe extends AlbumItem implements AlbumInterface {

	protected String shoeName;
	protected int shoeSize;
	protected String shoeColor;
	
	//Constructor.
	public FavouriteShoe(String itemType, String shoeName, int shoeSize, String shoeColor) {
		super(itemType);
		this.shoeName = shoeName;
		this.shoeSize = shoeSize;
		this.shoeColor = shoeColor;
	}
	
	public String getImage() {
		String thisShoe = (itemType + ".PNG");
		return itemType;
	}

	public String getFacts() {
		String artistFacts = ("This is the " + shoeColor + " colored " + shoeName + ". My size for this shoe is " + shoeSize + ".");
		return artistFacts;
	}

}
