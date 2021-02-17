public class LaptopComputer extends Computer{
	
	protected double batteryLife = 99.99;

	//Constructor.
	public LaptopComputer(String manufacturer, double compSpeed, double compMemory, double screenSize, double batteryLife) {
		super(manufacturer, compSpeed, compMemory, screenSize);
		this.batteryLife = batteryLife;
	}
	
	public String toString()
	{
		return "Manufacturer: " + manufacturer + ". \n" + "Computer Speed: " + compSpeed + " GHz. \n" + "Computer Memory: " + compMemory + " GB. \n" + "Screen Size: " + screenSize + " inches. \n" + "Battery Life: " + batteryLife + " MAh.";
	}

}
