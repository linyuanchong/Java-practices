public class Lab2Part5
{

	public static void main(String[] args)
	{
		//Show input options.
		System.out.println("Available vehicle types: ");
		System.out.println(" ");
		System.out.println("motorbike \t 10c. ");
		System.out.println("car \t\t 20c. ");
		System.out.println("van \t\t 30c. ");
		System.out.println("bus \t\t 50c. ");
		System.out.println("truck \t\t 100c. ");
		System.out.println("spaceship \t 10000c. ");
		System.out.println("plane \t\t 5000. ");
		System.out.println("skateboard \t 5c. ");
		System.out.println("train \t\t 900c. ");
		System.out.println("rocket \t\t 2000c. ");
		System.out.println(" ");

		//Call function.
		outputTotalTolls();
	}

	public static String[] outputTotalTolls()
	{
		//Create array for input.
		String[] vehicleCount = new String[11];

		vehicleCount[0] = "bus";
		vehicleCount[1] = "motorbike";
		vehicleCount[2] = "truck";
		vehicleCount[3] = "car";
		vehicleCount[4] = "van";
		vehicleCount[5] = "train";
		vehicleCount[6] = "plane";
		vehicleCount[7] = "skateboard";
		vehicleCount[8] = "rocket";
		vehicleCount[9] = "spaceship";

		//Call next function.
		getVehicleCharge(vehicleCount);
		return vehicleCount;
	}

	public static double getVehicleCharge(String vehicleCount[])
	{
		//Create variable cost to store total amount.
		double cost = 0;

		//Nested if(s) to verify input and check price.
		for (int i=0; i < vehicleCount.length; i++)
		{
			if (vehicleCount[i] == "motorbike")
			{
				cost += 10;
			}
			else if (vehicleCount[i] == "car")
			{
				cost += 20;
			}
			else if (vehicleCount[i] == "van")
			{
				cost += 30;
			}
			else if (vehicleCount[i] == "bus")
			{
				cost += 50;
			}
			else if (vehicleCount[i] == "truck")
			{
				cost += 100;
			}
			else if (vehicleCount[i] == "spaceship")
			{
				cost += 10000;
			}
			else if (vehicleCount[i] == "plane")
			{
				cost += 5000;
			}
			else if (vehicleCount[i] == "skateboard")
			{
				cost += 5;
			}
			else if (vehicleCount[i] == "train")
			{
				cost += 900;
			}
			else if (vehicleCount[i] == "rocket")
			{
				cost += 2000;
			}
		}

		//Print result.
		System.out.println("Total cost is: " + cost + "c");
		return cost;

	}

}