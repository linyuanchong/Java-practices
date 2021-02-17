package mathematics;

/**
 * @author linyu
 *
 */
public class MathHelper {
	
	public static int myint = 5;

	public static void main(String[] args) {
		factorial(myint);
		System.out.println(factorial(myint));
	}
	
	/**
	 * @param myint: variable as testing input.
	 * @return a value is returned.
	 */
	public static int factorial(int myint) {
		if (myint == 1) {
			return 1;
		}
		else {
			return myint*(factorial(myint-1));
		}
	}

}
