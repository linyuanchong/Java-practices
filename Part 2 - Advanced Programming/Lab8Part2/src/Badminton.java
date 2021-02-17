//Basketball subclass.
public class Badminton extends Sport implements SportInterface{
	
	protected String basicGear;
	protected int numOfPlayers;
	protected String maleOrFemale;
	
	//Constructor for only sportName.
	public Badminton(String sportName) {
		super(sportName);
	}
	
	//Constructor for only sportName and basicGear.
	public Badminton(String sportName, String basicGear) {
		super(sportName);
		this.basicGear = basicGear;
	}
	
	//Constructor for only sportName, basicGear and numOfPlayers.
	public Badminton(String sportName, String basicGear, int numOfPlayers) {
		super(sportName);
		this.basicGear = basicGear;
		this.numOfPlayers = numOfPlayers;
	}
	
	//Constructor for all
	public Badminton(String sportName, String basicGear, int numOfPlayers, String maleOrFemale) {
		super(sportName);
		this.basicGear = basicGear;
		this.numOfPlayers = numOfPlayers;
		this.maleOrFemale = maleOrFemale;
	}
	
	//toString.
	public String toString()
	{
		return "Sport Name: " + sportName + " \nBasic Gear: " + basicGear + " \nNumber of players: " + numOfPlayers + "\nGender: " + maleOrFemale;
	}
	
	//Compulsory method from interface.
	public String howToPlayThisSport() {
		System.out.println("Pick up a " + basicGear + " and play.");
		return "";
	}
	


	
}
