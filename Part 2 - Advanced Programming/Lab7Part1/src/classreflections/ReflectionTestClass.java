package classreflections;

/**
 * @author linyu
 *
 */
public class ReflectionTestClass {

	public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
	
	//Create class object.
	ReflectionTestClass myObject1 = new ReflectionTestClass();
	
	//Get class of object using getClass().
	Class myClass = myObject1.getClass();
	//Return class object using forName().
	Class myClass2 = Class.forName("TestClass");
	//Create new instance of object via newInstance().
	Object myObject2 = myClass.newInstance();
	
	//Print class name using getClass().
    System.out.println("The name of class is '" + myClass + "'"); 
    
	}
}