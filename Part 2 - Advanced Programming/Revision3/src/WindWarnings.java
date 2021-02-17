public final class WindWarnings {
	
	//Final static PI.
	final static int YELLOW_WIND_WARNING_MIN = 50;
	final static int ORANGE_WIND_WARNING_MIN = 65;
	final static int RED_WIND_WARNING_MIN = 80;
	
	public static int todayWindSpeed = 85;
	
	public static void main(String[] args) {
		getTodaysWindWarning(todayWindSpeed);
	}
	
	public static int getTodaysWindWarning(int todayWindSpeed) {
		if (todayWindSpeed >= YELLOW_WIND_WARNING_MIN && todayWindSpeed < ORANGE_WIND_WARNING_MIN) {
			System.out.println(todayWindSpeed + "km/h, YELLOW WARNING.");
		}
		else if (todayWindSpeed >= ORANGE_WIND_WARNING_MIN && todayWindSpeed < RED_WIND_WARNING_MIN) {
			System.out.println(todayWindSpeed + "km/h, ORANGE WARNING.");
		}
		else if (todayWindSpeed >= RED_WIND_WARNING_MIN) {
			System.out.println(todayWindSpeed + "km/h, RED WARNING.");
		}
		
		return todayWindSpeed;
	}
}
