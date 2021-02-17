package warningsystem;
import logging.AssignmentLogger;

/**
 * @author linyu
 *
 */
public class RedWindWarning extends WindWeatherWarning{
	
	public static int botlimit = 85;
	public static String name = "RedWind";

	public void setBotlimit(int botlimit) {
		AssignmentLogger.logConstructor(this);
		this.botlimit = botlimit;
		this.name = name;
	}

}
