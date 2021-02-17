public class LaptopComputer extends Computer {
	
	//New attribute of subclass.
	protected double batteryLife = 99.99;

	public LaptopComputer(double compSpeed, double compMemory, double screenSize, double batteryLife) {
		//Super constructor.
		super(compSpeed, compMemory, screenSize);
		this.batteryLife = batteryLife;
		
	}
	
	public String toString()
	{
		return "Computer Speed: " + compSpeed + " GHz. \n" + "Computer Memory: " + compMemory + " GB. \n" + "Screen Size: " + screenSize + " inches. \n" + "Battery Life: " + batteryLife + " MAh.";
	}

}