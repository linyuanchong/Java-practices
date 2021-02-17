package warningsystem;
import logging.AssignmentLogger;

/**
 * @author linyu
 *
 */
public class OrangeWindWarning extends WindWeatherWarning{
	
	public static int botlimit = 65;
	public static int toplimit = 85;
	public static String name = "OrangeWind";
	
	public OrangeWindWarning() {
		AssignmentLogger.logConstructor(this);
		this.botlimit = botlimit;
		this.toplimit = toplimit;
		this.name = name;
	}

}
