//Obtain input.
import java.util.Scanner;
public class Lab1Part1
{
	public static void main(String[] args)
	{
		//Set content.
		String name = "Chong Lin Yuan";

		//Creating array.
		char[]  namearray = new char[15];

		//Starting array, array length, array name, filled array.
		name.getChars(0, 14, namearray, 0);

		//Print array.
		System.out.println(namearray);

	}

}