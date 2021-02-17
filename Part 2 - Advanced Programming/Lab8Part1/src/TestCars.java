import java.util.Vector;

public abstract class TestCars {

	public static void main(String[] args) {
		ManualCar car1 = new ManualCar();
		AutomaticCar car2 = new AutomaticCar();

		Vector<Car> carList = new Vector<Car>();
		
		carList.addElement(car1);
		carList.addElement(car2);
		
		
		for (int i = 0; i < carList.size(); i++) {
			System.out.println(carList.elementAt(i).changeGearInstructions()+"\n");
		}
	}

}
