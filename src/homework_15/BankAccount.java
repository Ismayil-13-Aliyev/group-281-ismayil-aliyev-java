package homework_15;

public class BankAccount {
	String owner;
	double balance;
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		if(amount > 0) {
			System.out.println("norm");
		} else {
			System.out.println("malo deneg");
		}
	}
	
	public void getBalance() {
		System.out.println(balance);
	}
}
