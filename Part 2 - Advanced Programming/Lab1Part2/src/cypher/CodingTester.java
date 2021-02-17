package cypher;

/**
 * @author linyu
 *
 */
public class CodingTester {
	
	public static String str = "bcdefg";

	public static void main(String[] args) {
		Encoder.encode(str);
		System.out.println("\n");
		Decoder.decode(str);
	}

}
