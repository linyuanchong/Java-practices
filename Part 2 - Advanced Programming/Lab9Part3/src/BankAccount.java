public class BankAccount {
	
	public int balance;
	
	public BankAccount(int balance) {
		this.balance = balance;
	}
	
	//Synchronized methods.
	public synchronized int getBalance(int newBalance) {
		return balance;
	}

	public synchronized int makeWithdrawl(int deducted) {
		balance = balance - deducted;
		return balance;
	}
}
