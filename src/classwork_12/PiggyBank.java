package classwork_12;

public class PiggyBank {
	double balance = 0;
	boolean isBroken = false;
	
	public void addMoney(double amount) {
		if (isBroken == false) {
			balance += amount;
		}
	}
	
	public double breakOpen() {
		isBroken = true;
		return balance;
	}
	
	public void geBalance() {
		if (isBroken == false) {
			System.out.println(balance);
		}
	}
}
