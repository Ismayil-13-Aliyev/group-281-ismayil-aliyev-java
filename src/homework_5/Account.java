package homework_5;

public class Account {
		String owner;
		double balanse;
		
		public Account(String owner, double balance) {
			this.owner = owner;
			this.balanse = balanse;
		}	
		
		public void deposit(double amount) {
			System.out.println(balanse += amount);
		}
		public void withdraw(double amount) {
			System.out.println(balanse);
		}
}
