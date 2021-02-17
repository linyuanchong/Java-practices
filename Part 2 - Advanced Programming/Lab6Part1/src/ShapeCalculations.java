public final class ShapeCalculations {
	
	//Final static PI.
	final static double PI = 3.14159;
	//For rectangleArea.
	public static double rectangleArea = 0;
	public static double length = 0;
	public static double width = 0;
	//For circleCircumference.
	public static double circleCircumference = 0;
	public static double radius = 0;
	//For triangleArea.
	public static double triangleArea = 0;
	public static double base = 0;
	public static double height = 0;
	
	
	public static double getAreaOfRectangle(double length, double width) {
		rectangleArea = length*width;
		System.out.println(rectangleArea);
		return rectangleArea;
	}
	
	public static double getCircumferenceOfCircle(double radius) {
		circleCircumference = 2*PI*radius;
		System.out.println(circleCircumference);
		return circleCircumference;
	}
	
	public static double getAreaOfTriangle(double base, double height) {
		triangleArea = (base*height)/2;
		System.out.println(triangleArea);
		return triangleArea;
	}
}
