import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author linyu
 *
 */
public class Revision1{
	
	/**
	 * @param args
	 */
	public static void main(String args[]) {
		
		//Logger.
		final Logger logger = Logger.getLogger(Revision1.class.getName());
		
		//Variables declaration for strings.
		String[] car = {"Ford", "Ferrari", "Nissan"};
		
		try {
			//This one should be caught by index exception.
			System.out.println(car[9]);
		}
		
		//Catches index exceptions.
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println ("Index out of bounds.");
			logger.log(Level.SEVERE, "Just a stack trace.", e);
		}
	}
   
}