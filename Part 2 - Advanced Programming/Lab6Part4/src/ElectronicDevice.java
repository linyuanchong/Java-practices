public class ElectronicDevice {
	
	protected String manufacturer = "Sony";
	
	//Constructor.
	public ElectronicDevice (String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public String toString()
	{
		return "Manufacturer: " + manufacturer + ". \n";
	}
}
