import java.io.File;
import java.io.IOException;

/**
 * @author linyu
 *
 */
public class CheckVUncheckedExceptions {

	public static String myString = "abcde";
	public static File fileName = new File("abcde.txt");
	
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException{
		
		 capitalizeString(myString);
		 
		 //Try check if file exists.
		 try {
			openFile(fileName);	
		 } 
		 
		 //If fail, exception caught here.
		 catch (IOException e) {
			throw e;
		 }

	}
	
	//This function throws a NullPointerException.
	/**
	 * @param myString
	 * @return returns an uppercased myString.
	 * @throws NullPointerException
	 */
	public static String capitalizeString(String myString) throws NullPointerException  {
		
		//Tries to print uppercased myString.
		try {
			System.out.println(myString.toUpperCase());
		}
		
		//if try{} fails, exception is caught here.
		catch (NullPointerException e) {
			//Throw exception away.
			throw e;
		}
		
		//Returns uppercased myString if try{} is successful.
		return myString.toUpperCase();
		
	}
	
	/**
	 * @param fileName
	 * @return returns the variable.
	 * @throws IOException
	 */
	public static File openFile(File fileName) throws IOException{
		
		if (fileName.exists()) {
			System.out.println("File exists.");
			return fileName;
		}
		
		else {
			System.out.println("File not found.");
			return fileName;
		}
	}

}
