public class MobilePhone extends HandHeldDevice{

	protected String networkName = "Three";
	
	//Constructor.
	public MobilePhone(String manufacturer, double weight, String networkName) {
		super(manufacturer, weight);
		this.networkName = networkName;
	}

	public String toString()
	{
		return "Manufacturer: " + manufacturer + " \n" + "Weight: " + weight + " Kg. \n" + "Network Name: " + networkName + ". \n";
	}

}
