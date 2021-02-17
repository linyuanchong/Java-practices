//Basketball subclass.
public class Basketball extends Sport implements SportInterface{
	
	protected String basicGear;
	protected int numOfPlayers;
	protected int maxPoints;
	
	//Constructor for only sportName.
	public Basketball(String sportName) {
		super(sportName);
	}
	
	//Constructor for only sportName and basicGear.
	public Basketball(String sportName, String basicGear) {
		super(sportName);
		this.basicGear = basicGear;
	}
	
	//Constructor for only sportName, basicGear and numOfPlayers.
	public Basketball(String sportName, String basicGear, int numOfPlayers) {
		super(sportName);
		this.basicGear = basicGear;
		this.numOfPlayers = numOfPlayers;
	}
	
	//Constructor for all.
	public Basketball(String sportName, String basicGear, int numOfPlayers, int maxPoints) {
		super(sportName);
		this.basicGear = basicGear;
		this.numOfPlayers = numOfPlayers;
		this.maxPoints = maxPoints;
	}

	//toString.
	public String toString()
	{
		return "Sport Name: " + sportName + " \nBasic Gear: " + basicGear + " \nNumber of players: " + numOfPlayers + "\nMaximum Points: " + maxPoints;
	}
	
	//Compulsory method from interface.
	public String howToPlayThisSport() {
		System.out.println("Pick up a ball and play.");
		return "";
	}


	
}
