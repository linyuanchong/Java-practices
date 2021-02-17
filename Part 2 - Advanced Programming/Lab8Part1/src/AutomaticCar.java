//Manual Car class.
public class AutomaticCar extends Car implements CarInterface{

	@Override
	public String changeGearInstructions() {
		System.out.println("Change automatic car gear.");
		System.out.println("Don't push the clutch.");
		return brand;
	}

}
