//Manual Car class.
public class ManualCar extends Car implements CarInterface{

	@Override
	public String changeGearInstructions() {
		System.out.println("Change manual car gear.");
		System.out.println("Push the clutch.");
		return brand;
	}

}
