package classwork_11;

public class BankAccount {
	double balance;
	
	public BankAccount(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		if (balance > amount) {
			balance -= amount;
		} else {
			System.out.println("Oshibka!");
		}
	}
	
	public void getBalance() {
		System.out.println(balance);
	}
}
