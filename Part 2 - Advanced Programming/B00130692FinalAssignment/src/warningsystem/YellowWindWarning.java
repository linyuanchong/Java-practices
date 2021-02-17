package warningsystem;
import logging.AssignmentLogger;

/**
 * @author linyu
 *
 */
public class YellowWindWarning extends WindWeatherWarning{
	
	public static int botlimit = 50;
	public static int toplimit = 65;
	public static String name = "YellowWind";
	
	public YellowWindWarning() {
		AssignmentLogger.logConstructor(this);
		this.botlimit = botlimit;
		this.toplimit = toplimit;
		this.name = name;
	}

}
