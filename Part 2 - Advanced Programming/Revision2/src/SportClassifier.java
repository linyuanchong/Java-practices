

/**
 * @author linyu
 *
 */
public class SportClassifier {

	enum Sports {
		BASKETBALL,
		BADMINTON,
		FOOTBALL
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Sports mySport = Sports.BASKETBALL;
		
		getFamousSportVenue(mySport);
	}
	
	/**
	 * @param mySport
	 */
	public static void getFamousSportVenue(Sports mySport) {
		if (mySport == Sports.BASKETBALL) {
			System.out.println("Barclays Center.");
		}
		
		if (mySport == Sports.BADMINTON) {
			System.out.println("Shuttle Blacks.");
		}
		
		if (mySport == Sports.FOOTBALL) {
			System.out.println("Old Trafford.");
		}
	}

}