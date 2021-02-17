import java.util.Vector;

public class TestSport {

	public static void main(String[] args) {
		
		//Vector for badminton.
		Vector<Badminton> badVector = new Vector<Badminton>(4);
		//5 badminton objects.
		Badminton bad1 = new Badminton("badminton");
		Badminton bad2 = new Badminton("badminton", "badminton racket");
		Badminton bad3 = new Badminton("badminton", "shuttlecock", 4);
		Badminton bad4 = new Badminton("badminton", "racket kit bag", 2, "female");
		Badminton bad5 = new Badminton("badminton", "badminton shoes", 4, "male");
		badVector.add(bad1);
		badVector.add(bad2);
		badVector.add(bad3);
		badVector.add(bad4);
		badVector.add(bad5);
		
		//Vector for basketball.
		Vector<Basketball> basVector = new Vector<Basketball>(4);
		//5 basketball objects.
		Basketball bas1 = new Basketball("basketball");
		Basketball bas2 = new Basketball("basketball", "jersey");
		Basketball bas3 = new Basketball("basketball", "basketball shoe", 4);
		Basketball bas4 = new Basketball("basketball", "basketball ", 2, 7);
		Basketball bas5 = new Basketball("basketball", "hoop", 6, 21);
		basVector.add(bas1);
		basVector.add(bas2);
		basVector.add(bas3);
		basVector.add(bas4);
		basVector.add(bas5);
		
		//Print badminton vector.
		System.out.println("BADMINTON____________________________________\n");
		for (int i = 0; i < badVector.size(); i++) {
			System.out.println(badVector.elementAt(i).howToPlayThisSport() + badVector.elementAt(i) + "\n");
		}
		
		//Print basketball vector.
		System.out.println("BASKETBALL___________________________________\n");
		for (int i = 0; i < basVector.size(); i++) {
			System.out.println(basVector.elementAt(i).howToPlayThisSport() + basVector.elementAt(i) + "\n");
		}
		
	}

}
