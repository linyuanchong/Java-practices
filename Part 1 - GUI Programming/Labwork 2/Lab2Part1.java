//Input Scanner.
import java.util.Scanner;
public class Lab2Part1
{
	public static void main(String[] args)
	{
		//Call method.
		checkAge();
	}


	public static void checkAge()
	{
		//Actual age.
		int myAge = 20;

		//Get input from user.
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int inAge = input.nextInt();

		//Verification.
		if (inAge == myAge)
		{
			System.out.println("Age is equal.");
		}
		else if (inAge < myAge)
		{
			System.out.println("Age is lesser, please try again.");
			checkAge();
		}
		else if (inAge > myAge)
		{
			System.out.println("Age is greater, please try again.");
			checkAge();
		}
	}
}
