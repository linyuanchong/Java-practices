import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class InvestigatorClass {

	public static void main(String[] args) {
		MysteryClass mc1 = new MysteryClass();
		
		Class myClass = mc1.getClass();
		
		//Fields.
		Field[] myFields = myClass.getDeclaredFields();
		//Methods.
		Method[] myMethods = myClass.getMethods();
		
		//Display fields.
		System.out.println("FIELDS:");
		for (int i = 0; i < myFields.length; i++) {
			System.out.println("Field: " + myFields[i].getName());
		}
		
		//Display field types.
		System.out.println("\nFIELD TYPES:");
		for (int i = 0; i < myFields.length; i++) {
			System.out.println("Field type: " + myFields[i].getType().getName());
		}
		
		//Display methods.
		System.out.println("\nMETHODS:");
		for (int i = 0; i < myMethods.length; i++) {
			if ((myMethods[i].getReturnType().getName()).toString() == "int" || (myMethods[i].getReturnType().getName()).toString() == "boolean" || (myMethods[i].getReturnType().getName()).toString() == "double") {
				System.out.println("Method: "+ myMethods[i].getName());
			}
		}
		
		//Display method types.
		System.out.println("\nMETHOD TYPES:");
		for (int i = 0; i < myMethods.length; i++) {
			if ((myMethods[i].getReturnType().getName()).toString() == "int" || (myMethods[i].getReturnType().getName()).toString() == "boolean" || (myMethods[i].getReturnType().getName()).toString() == "double") {
				System.out.println("Method type: " + myMethods[i].getReturnType().getName());
			}
		}
		
		//Display method parameter types.
		System.out.println("\nMETHOD PARAMETER TYPES:");
		for (int i = 0; i < myMethods.length; i++) {
			System.out.println("Method parameter type: " + (myMethods[i].getParameters()).toString());
		}
		
		//Invoke.
		MysteryClass newObject = new MysteryClass();
		Method newMethod = newObject.getClass().getMethod("publicMethod", int.class);
		newMethod.invoke(newObject, 2);
		
		
		
	}

}
