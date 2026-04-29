package classwork_11;

public class Classwork_11 {
	public static void main(String[] args) {
		Cat c = new Cat("Barsik", "Seriy", 6);
		c.meow();
		
		Rectangle r_1 = new Rectangle(12, 8);
		Rectangle r_2 = new Rectangle(18, 5);
		
		if (r_1.area() > r_2.area()) {
			System.out.println("area_1 is bigger");
		} else if(r_2.area() > r_1.area()) {
			System.out.println("area_2 is bigger");
		} else if(r_2.area() == r_1.area()) {
			System.out.println("area_1 = area_2");
		}
		
		BankAccount b = new BankAccount(29824);
		
		b.deposit(324);
		b.withdraw(1932);
		b.getBalance();
	}
}
