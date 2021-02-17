
public class ComputerInheritenceTest {

	public static void main(String[] args) {
		//Create computer object.
		Computer comp1 = new Computer(3.0, 16.0, 20.0);
		Computer comp2 = new Computer(3.5, 8.0, 17.0);
		//Create laptopcomputer object.
		LaptopComputer comp3 = new LaptopComputer(3.5, 8.0, 17.0, 4400.0);
		LaptopComputer comp4 = new LaptopComputer(4.0, 8.0, 15.0, 3600.0);
		
		System.out.println(comp1);
		System.out.println();
		System.out.println(comp2);
		System.out.println();
		System.out.println(comp3);
		System.out.println();
		System.out.println(comp4);
	}

}
