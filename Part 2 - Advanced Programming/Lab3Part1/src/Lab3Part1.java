import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author linyu
 *
 */
public class Lab3Part1 {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		
		//Declared in public to go across classes (try, catch, finally).
		//Declare new BufferedReader to read file information.
		BufferedReader newBF = null;
		//Declare a String to store file name.
		String teamFile = "myFavTeam.txt";
	  
		//Try block here.
		try {
			
			//Declare String variable to store file info.
			String lineInFile = " ";
			
			//Define BufferedReader with file name variable.
			newBF = new BufferedReader(new FileReader(teamFile));
			
			//While not null(!=EOF), String String=BufferedReader.readLine().
			while ((lineInFile = newBF.readLine()) != null) {
				System.out.println(lineInFile);
			}
	
		}
		
		//Catch block to catch any IOExceptions.
		catch (IOException e) {
			//Prompt message.
			System.out.println("File not found.");
			//If caught, printStachTrace().
			e.printStackTrace();
		} 
		
		//Finally block.
		finally {
			//Closes BufferedReader.
			newBF.close();
		}
	}
}
