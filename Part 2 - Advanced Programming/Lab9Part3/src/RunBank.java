public class RunBank extends Thread{
	
	public static void main(String[] args) {
		
		//Run threads.
		for(int i = 1; i <= 1000; i++) {
			//Start thread.
			new BankTransaction("ThisThread").start();
		}

	}
}