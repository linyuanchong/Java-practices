public class Lab1Part4
{
	public static void main(String[] args)
	{
		//Declare array to store rain data.
		double[] rainmmarray = new double[2];

		rainmmarray[0] = 10.5;
		rainmmarray[1] = 0.5;

		//Declare double-dimensional array to store rain data.
		double[][] rainckntsarray = {{10.5f, 10.3f}, {12.5f, 5.5f}};


		//Print data.
		for (int b=0; b <= (rainckntsarray.length-1); b++)
		{
			System.out.println("Day " + (b+1) + ": " + rainmmarray[b] + "\t" + rainckntsarray[0][0] + "C \t" + rainckntsarray[1][1] + "knts \t" );
		}

		System.out.println(" ");

	}

}