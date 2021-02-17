package warningsystem;
import logging.AssignmentLogger;

/**
 * @author linyu
 *
 */
public class GreenWindWarning extends WindWeatherWarning{
	
	public static int toplimit = 50;
	public static String name = "AllClear";
	
	
	public GreenWindWarning() {
		AssignmentLogger.logConstructor(this);
		this.toplimit = toplimit;
		this.name = name;
	}

}
