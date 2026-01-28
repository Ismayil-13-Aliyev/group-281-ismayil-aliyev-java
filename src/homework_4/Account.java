package homework_4;

public class Account {
	String owner;
	double balanse;
	
	public Account(String owner, double balanse) {
		this.owner = owner;
		this.balanse = balanse;
	}

	public void deposit(double amount) {
		amount = 35;
		System.out.println(amount);
	}
	
	public void withdraw (double amount) {
		amount = 2342;
		if (amount > 1500) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
	
	public void getbalanse() {
		System.out.println(balanse);
	}
}
