//The thread itself.
class BankTransaction extends Thread {
	//Static bank account object.
	public static BankAccount myBank = new BankAccount(10000);
	
	//Sets thread name type.
	public BankTransaction(String str) {
		super(str);
	}
	
	//What the thread does.
	public void run() {
		try {
			myBank.makeWithdrawl(10);
			System.out.println("Your bank account balance (thread " + getName() + "): " + myBank.getBalance(0));
		}
		//Catch exception when index outta bounds.
		catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Array out of bounds!");
		}
		
	}
		
}


