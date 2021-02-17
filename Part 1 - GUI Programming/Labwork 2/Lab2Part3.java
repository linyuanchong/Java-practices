public class Lab2Part3
{
	//Integer to store numeric value of name.
	public static int nameValue = 0;

	public static void main(String[] args)
	{
		char[] myNameArray = {'C', 'H', 'O', 'N', 'G', 'L', 'I', 'N', 'Y', 'U', 'A', 'N', };

		//Call method, bringing variable "myNameArray" into it.
		calculateMyNameCharacterValue(myNameArray);
	}

	public static int calculateMyNameCharacterValue(char myNameArray[])
	{
		for (int i=0; i < myNameArray.length; i++)
		{
			//nameValue = nameValue + myNameArray[i]
			nameValue += myNameArray[i];
		}

		System.out.println(nameValue);

		return nameValue;
	}
}