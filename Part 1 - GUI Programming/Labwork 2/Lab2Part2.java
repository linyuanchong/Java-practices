//Input Scanner.
import java.util.Scanner;
public class Lab2Part2
{
	static int voteAge = 18;


	public static void main(String[] args)
	{
		//Get input from user.
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int inAge = input.nextInt();

		//Call method.
		canVote(inAge);
	}

	public static int canVote(int inAge)
	{
		//Verification.
		if (inAge < voteAge)
		{
			System.out.println("Age is lesser, can't vote.");
		}
		else if (inAge >= voteAge)
		{
			System.out.println("Age met, can vote.");
		}
		return inAge;
	}
}