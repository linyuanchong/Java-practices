//Sport superclass.
public abstract class Sport {
	
	protected String sportName = " ";
	
	//Class constructor.
	public Sport (String sportName) {
		this.sportName = sportName;
	}
	
	//Abstract method.
	protected abstract String howToPlayThisSport();

}