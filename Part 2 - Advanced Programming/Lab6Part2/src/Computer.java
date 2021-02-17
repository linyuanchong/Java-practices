public class Computer {
	
	protected double compSpeed = 2.5;
	protected double compMemory = 4.0;
	protected double screenSize = 15;
	
	public Computer(double compSpeed, double compMemory, double screenSize) {
		this.compSpeed = compSpeed;
		this.compMemory = compMemory;
		this.screenSize = screenSize;
	}
	
	public String toString()
	{
		return "Computer Speed: " + compSpeed + " GHz. \n" + "Computer Memory: " + compMemory + " GB. \n" + "Screen Size: " + screenSize + " inches.";
	}
	
}
