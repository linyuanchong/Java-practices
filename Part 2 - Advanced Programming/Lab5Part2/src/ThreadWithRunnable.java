public class ThreadWithRunnable { 
  
    public static void main(String[] args) 
    { 
        Thread threadOne = new Thread(new ThreadWithRunnable().new TestThread()); 
        Thread threadTwo = new Thread(new ThreadWithRunnable().new TestThread()); 
        Thread threadThree = new Thread(new ThreadWithRunnable().new TestThread()); 
        threadOne.start(); 
        threadTwo.start(); 
        threadThree.start(); 
    } 
  
    private class TestThread implements Runnable { 
  
        public void run() 
        { 
    		int[] myArray = {1, 2, 3};
    		//Each thread tries to print array with a loop.
    		try {
    			for (int i = 0; i < 10; i++) {
    				System.out.println(Thread.currentThread().getName() + ": " + myArray[i]);
    			}	
    		}
    		//Catch exception when index outta bounds.
    		catch (ArrayIndexOutOfBoundsException exception) {
    			System.out.println("Array out of bounds!");
    		}
        } 
    } 
} 