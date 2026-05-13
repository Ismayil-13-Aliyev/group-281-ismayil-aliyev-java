package classwork_12;

public class Product {
	String name;
	double price;
	int quantity;
	
	public double getTotalPrice() {
		return price * quantity;
	}
}
