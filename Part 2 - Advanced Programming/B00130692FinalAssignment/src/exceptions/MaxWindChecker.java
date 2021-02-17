package exceptions;
import logging.AssignmentLogger;

/**
 * @author linyu
 *
 */
public class MaxWindChecker {
	
	//Maximum wind speed variable as a check standard.
	public static int maxWindSpeed = 345;

	public static int checkWindSpeed(int inputWindSpeed) throws MaxWindException {
		
		AssignmentLogger.logStaticMethodEntry();
		
		//Check if wind speed is below 345.
		if(inputWindSpeed <= maxWindSpeed) {
			System.out.println("Valid wind speed.");
		}
		//Else, throw exception.
		else {
			throw new MaxWindException("Wind speed higher than the highest ever recorded, value might be wrong, unless we encounter something we never did.");
		} 
        //Return.
		
		AssignmentLogger.logStaticMethodExit();
		return inputWindSpeed;
	}
}
	