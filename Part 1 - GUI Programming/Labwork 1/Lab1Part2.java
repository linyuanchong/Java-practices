public class Lab1Part2
{
	public static void main(String[] args)
	{
		//Creating array.
		int[] datearray = new int[8];

		datearray[0] = 1;
		datearray[1] = 6;
		datearray[2] = 3;
		datearray[3] = 1;
		datearray[4] = 9;
		datearray[5] = 9;
		datearray[6] = 9;

		//Print first 2 integers of array.
		for (int i=0; i <= 1; i++)
		{
			System.out.print(datearray[i]);
		}

		System.out.print(" ");

		//Print third integer of array.
		for (int i=2; i <= 2; i++)
		{
			System.out.print(datearray[i]);
		}

		System.out.print(" ");

		//Print last 4 integers of array.
		for (int i=3; i <= 6; i++)
		{
			System.out.print(datearray[i]);
		}

	}

}