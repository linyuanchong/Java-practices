public class ThreadWithExtends {
	
	public static void main(String[] args) {
		//Three threads (and start).
		new TestThread("Alpha").start();
		new TestThread("Beta").start();
		new TestThread("Gamma").start();

	}
}

//The thread itself.
class TestThread extends Thread {
	//Sets thread variable type.
	public TestThread(String str) {
		super(str);
	}
	
	//What the thread does.
	public void run() {
		
		String[] myArray = {"A", "B", "C"};
		//Each thread tries to print array with a loop.
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("Thread " + getName() + ": " + myArray[i]);
			}	
		}
		//Catch exception when index outta bounds.
		catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Array out of bounds!");
		}
		
	}
		
}


