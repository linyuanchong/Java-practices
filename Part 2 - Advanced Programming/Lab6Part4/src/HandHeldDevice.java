public class HandHeldDevice extends ElectronicDevice{
	
	protected double weight = 10.0;
	
	//Constructor.
	public HandHeldDevice(String manufacturer, double weight) {
		super(manufacturer);
		this.weight = weight;
	}
	
	public String toString()
	{
		return "Manufacturer: " + manufacturer + " \n" + "Weight: " + weight + " Kg. \n";
	}

}
