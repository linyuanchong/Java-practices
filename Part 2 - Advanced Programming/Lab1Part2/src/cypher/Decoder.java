package cypher;

/**
 * @author linyu
 *
 */
public class Decoder {

	public static String str = "epopwbo";

	public static void main(String[] args) {
		decode(str);
	}

	/**
	 * @param str: string value as input
	 * @return a value is returned
	 */
	public static String decode(String str) {
		for (int i = 0; i < str.length(); i++) {
			//(char) allows output in characters, charAt() gets a char VALUE at the given index number.
			System.out.print((char)(str.charAt(i) - 1));
		}
		return str;
	}
}
