public class Lab1Part5
{
	public static void main(String[] args)
	{
		//Declaring alphabets array.
		String[] alphabets = new String[50];

		alphabets[0] = "A";
		alphabets[1] = "B";
		alphabets[2] = "C";
		alphabets[3] = "D";
		alphabets[4] = "E";
		alphabets[5] = "F";
		alphabets[6] = "G";
		alphabets[7] = "H";
		alphabets[8] = "I";
		alphabets[9] = "J";
		alphabets[10] = "K";
		alphabets[11] = "L";
		alphabets[12] = "M";
		alphabets[13] = "N";
		alphabets[14] = "O";
		alphabets[15] = "P";
		alphabets[16] = "Q";
		alphabets[17] = "R";
		alphabets[18] = "S";
		alphabets[19] = "T";
		alphabets[20] = "U";
		alphabets[21] = "V";
		alphabets[22] = "W";
		alphabets[23] = "X";
		alphabets[24] = "Y";
		alphabets[25] = "Z";

		//Declaring numbers array.
		String[] numbers = new String[50];

		numbers[0] = "0";
		numbers[1] = "1";
		numbers[2] = "2";
		numbers[3] = "3";
		numbers[4] = "4";
		numbers[5] = "5";
		numbers[6] = "6";
		numbers[7] = "7";
		numbers[8] = "8";
		numbers[9] = "9";
		numbers[10] = "10";
		numbers[11] = "11";
		numbers[12] = "12";
		numbers[13] = "13";
		numbers[14] = "14";
		numbers[15] = "15";
		numbers[16] = "16";
		numbers[17] = "17";
		numbers[18] = "18";
		numbers[19] = "19";
		numbers[20] = "20";
		numbers[21] = "21";
		numbers[22] = "22";
		numbers[23] = "23";
		numbers[24] = "24";
		numbers[25] = "25";


		//Declaring my name array.
		String[] myname = new String[30];

		myname[0] = "C";
		myname[1] = "H";
		myname[2] = "O";
		myname[3] = "N";
		myname[4] = "G";
		myname[5] = "L";
		myname[6] = "I";
		myname[7] = "N";
		myname[8] = "Y";
		myname[9] = "U";
		myname[10] = "A";
		myname[11] = "N";

		System.out.print("Name Code: ");

		//Variable to control myname.
		int n = 0;

		//Check loop (Unsolved: last two alphabets unchecked).
		for (int a=0; a <= myname.length + 2; a++)
		{
			if (myname[n] == alphabets[a])
			{
				//Here you can alter the code by a+ or a-.
				System.out.print(numbers[a] + ", ");
				n++;
				a=0;
			}
		}
	}
}
