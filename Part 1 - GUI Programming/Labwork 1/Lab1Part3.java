public class Lab1Part3
{
	public static void main(String[] args)
	{
		//Declare array to store rain data.
		double[] rainmmarray = new double[2];

		rainmmarray[0] = 10.5;
		rainmmarray[1] = 0.5;


		//Print data.
		for (int a=0; a <= (rainmmarray.length-1); a++)
		{
			System.out.println("Day " + (a+1) + ": " + rainmmarray[a] + "mm \t" );
		}

		System.out.println(" ");

	}

}


