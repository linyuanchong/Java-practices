import java.util.Vector;

public class TestFullHiearchy {

	public static void main(String[] args) {
		
		//Electronic Devices.
		Vector<ElectronicDevice> deviceVector = new Vector<ElectronicDevice>(1);
		ElectronicDevice dev1 = new ElectronicDevice("Sony");
		ElectronicDevice dev2 = new ElectronicDevice("Nokia");
		deviceVector.add(0, dev1);
		deviceVector.add(1, dev2);
		
		//Handheld Devices.
		Vector<HandHeldDevice> handVector = new Vector<HandHeldDevice>(1);
		HandHeldDevice hand1 = new HandHeldDevice("Huawei", 3.0);
		HandHeldDevice hand2 = new HandHeldDevice("Samsung", 2.5);
		handVector.add(0, hand1);
		handVector.add(1, hand2);
		
		//Computers.
		Vector<Computer> computerVector = new Vector<Computer>(1);
		Computer comp1 = new Computer("Acer", 2.5, 4.0, 15.0);
		Computer comp2 = new Computer("Lenovo", 3.0, 4.0, 20.0);
		computerVector.add(0, comp1);
		computerVector.add(1, comp2);
		
		//Laptop Computers.
		Vector<LaptopComputer> laptopVector = new Vector<LaptopComputer>(1);
		LaptopComputer lap1 = new LaptopComputer("Windows", 3.5, 8.0, 25.0, 4.5);
		LaptopComputer lap2 = new LaptopComputer("Dell", 4.0, 16.0, 10.0, 5.0);
		laptopVector.add(0, lap1);
		laptopVector.add(1, lap2);
		
		//Walkie Talkies.
		Vector<WalkieTalkie> talkVector = new Vector<WalkieTalkie>(1);
		WalkieTalkie talk1 = new WalkieTalkie("Motorola", 2.5, 1.0);
		WalkieTalkie talk2 = new WalkieTalkie("Cobra", 2.0, 1.5);
		talkVector.add(0, talk1);
		talkVector.add(1, talk1);
		
		//Mobile Phones.
		Vector<MobilePhone> mobVector = new Vector<MobilePhone>(1);
		MobilePhone mob1 = new MobilePhone("Samsung", 2.5, "Three");
		MobilePhone mob2 = new MobilePhone("Apple", 3.0, "VodaPhone");
		mobVector.add(0, mob1);
		mobVector.add(1, mob2);

		//Print Vectors.
		System.out.println(deviceVector + "\n");
		System.out.println(handVector + "\n");
		System.out.println(computerVector + "\n");
		System.out.println(laptopVector + "\n");
		System.out.println(talkVector + "\n");
		System.out.println(mobVector + "\n");
		
	}

}
