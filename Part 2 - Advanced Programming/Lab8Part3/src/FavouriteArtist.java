import java.awt.*;

public class FavouriteArtist extends AlbumItem implements AlbumInterface {

	protected String artistName;
	protected int artistAge;
	protected String famousSong;
	
	//Constructor.
	public FavouriteArtist(String itemType, String artistName, int artistAge, String famousSong) {
		super(itemType);
		this.artistName = artistName;
		this.artistAge = artistAge;
		this.famousSong = famousSong;
	}
	
	public String getImage() {
		String thisArtist = (itemType + ".PNG");
		return itemType;
	}

	public String getFacts() {
		String artistFacts = ("This is " + artistName + ". He is " + artistAge + " years old. " + famousSong + " is one of his famous songs.");
		return artistFacts;
	}

}
