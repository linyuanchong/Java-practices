package cypher;

/**
 * @author linyu
 *
 */
public class Encoder {

	public static String str = "donovan";

	public static void main(String[] args) {
		encode(str);
	}

	/**
	 * @param str: string value as input
	 * @return a value is returned
	 */
	public static String encode(String str) {
		for (int i = 0; i < str.length(); i++) {
			//(char) allows output in characters, charAt() gets a char VALUE at the given index number.
			System.out.print((char)(str.charAt(i) + 1));
		}
		return str;
	}
}
