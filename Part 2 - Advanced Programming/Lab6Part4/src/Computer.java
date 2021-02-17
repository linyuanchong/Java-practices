public class Computer extends ElectronicDevice{
	
	protected double compSpeed = 2.5;
	protected double compMemory = 4.0;
	protected double screenSize = 15;
	
	//Constructor.
	public Computer(String manufacturer, double compSpeed, double compMemory, double screenSize) {
		super(manufacturer);
		this.compSpeed = compSpeed;
		this.compMemory = compMemory;
		this.screenSize = screenSize;
		
	}
	
	public String toString()
	{
		return "Manufacturer: " + manufacturer + ". \n" + "Computer Speed: " + compSpeed + " GHz. \n" + "Computer Memory: " + compMemory + " GB. \n" + "Screen Size: " + screenSize + " inches. \n";
	}

	
}
