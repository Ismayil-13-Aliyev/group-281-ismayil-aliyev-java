package homework_14;

public class Bank {
	private static Bank instance;
	private int balance = 0;
	    
	    
	public static Bank getInstance() {
		if (instance == 0) { //?????????????
			Bank bank = new Bank();
		}
	    return instance;
	}
	    
	public void deposit(int amount) {
		balance += amount; 
	}
	
	public int getBalance() {
		return balance; 
	}
}
