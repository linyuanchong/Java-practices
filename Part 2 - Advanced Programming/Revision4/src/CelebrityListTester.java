/**
 * @author linyu
 *
 */
public class CelebrityListTester {

	public static void main(String[] args) {

		//Name.
		Celebrity c1 = new Celebrity("Charlie Puth");
		System.out.println(c1.name);
		
		//Name and whatTheyAreFamousFor.
		Celebrity c2 = new Celebrity("Wiz Khalifa", "Rapping");
		System.out.println(c2.whatTheyAreFamousFor);
		
		//All attributes.
		Celebrity c3 = new Celebrity("James Arthur", "Singing", "jamesarthur");
		System.out.println(c3.instagramUserName);
		
	}

}
