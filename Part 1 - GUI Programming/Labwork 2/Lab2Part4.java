//Input Scanner.
import java.util.Scanner;
public class Lab2Part4
{
	public static String outputReversed = "";

	public static void main(String[] args)
	{
		String[] inputArray = new String[3];

		//Get first input from user.
		Scanner input1 = new Scanner(System.in);
		System.out.print("Enter first word: ");
		String firstWord = input1.nextLine();
		inputArray[0] = firstWord;

		//Get second input from user.
		Scanner input2 = new Scanner(System.in);
		System.out.print("Enter second word: ");
		String secondWord = input2.nextLine();
		inputArray[1] = secondWord;

		//Get third input from user.
		Scanner input3 = new Scanner(System.in);
		System.out.print("Enter third word: ");
		String thirdWord = input3.nextLine();
		inputArray[2] = thirdWord;

		outputInReverse(inputArray);

		System.out.println(outputReversed);

	}

	public static String outputInReverse(String inputArray[])
	{
		for (int i=2; i < inputArray.length; i--)
		{
			//To prevent array to reach value -1 and crashes the program.
			if (i==-1)
			{
				break;
			}
			else if (i!=-1)
			{
				//outputReversed = inputArray + outputReversed[i]
				outputReversed += inputArray[i] + ", " ;
			}
		}

		return outputReversed;
	}


}