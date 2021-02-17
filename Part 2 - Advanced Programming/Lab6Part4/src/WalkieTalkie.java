public class WalkieTalkie extends HandHeldDevice{

	protected double rangeInKm = 1.5;
	
	//Constructor.
	public WalkieTalkie(String manufacturer, double weight, double rangeInKm) {
		super(manufacturer, weight);
		this.rangeInKm = rangeInKm;
	}

	public String toString()
	{
		return "Manufacturer: " + manufacturer + " \n" + "Weight: " + weight + " Kg. \n" + "Range(Km): " + rangeInKm + "Km. \n";
	}

}
