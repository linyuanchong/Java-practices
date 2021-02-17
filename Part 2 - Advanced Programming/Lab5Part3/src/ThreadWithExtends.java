public class ThreadWithExtends {
	public static void main(String[] args) {
		
		Thread t0 = new TestThread();
		Thread t1 = new TestThread();
		Thread t2 = new TestThread();
		t0.start();
		t1.start();
		t2.start();

	}
}

//The thread itself.
class TestThread extends Thread {
	
	//What the thread does.
	public void run() {
		//The sync block.
		synchronized (ThreadWithExtends.class) {
			MethodToBeRun();
		}
	}
	
	//The method to be run between in sync.
	private void MethodToBeRun() {
		String[] myArray = {"A", "B", "C"};
		//Each thread tries to print array with a loop.
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(getName() + ": " + myArray[i]);
			}
		}
		//Catch exception when index outta bounds.
		catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Array out of bounds!");
		}
	}
}

