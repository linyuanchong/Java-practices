/**
 * @author linyu
 *
 */
public class Lab1Part1 {
	
	public static int num = 10;

	public static void main(String[] args) {
		recursiveMultiplication(num);
		System.out.println(recursiveMultiplication(num));
	}
	
	/**
	 * @param num: variable number as input.
	 * @return a valued is returned.
	 */
	public static int recursiveMultiplication(int num) {
		if (num == 1) {
			return 1;
		}
		else {
			return num*(recursiveMultiplication(num-1));
		}
		
	}

}
