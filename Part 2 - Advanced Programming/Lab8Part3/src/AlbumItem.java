import java.awt.*;

public abstract class AlbumItem {
	
	protected String itemType;
	
	//Class constructor.
	public AlbumItem (String itemType) {
		this.itemType = itemType;
	}
	
	//Abstract method.
	protected abstract String getImage(); 
	protected abstract String getFacts(); 
	
}
