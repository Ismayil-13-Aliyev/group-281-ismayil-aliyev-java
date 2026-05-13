package classwork_12;

import java.util.ArrayList;

public class ShoppingCart {
	ArrayList<Product> products;
	
	public void addProduct(Product p) {
		products.add(p);
	}
	
	public void removeproduct(String name) {
		for(Product p : products) {
			if(p.name.equals(name)) {
				products.remove(p);
			}
		}
		
	}
	
	double sum;
	public void getTotal() {
		for(Product p : products) {
			sum += p.price;
		}
		System.out.println(sum);
	}
	
	public void printReceipt() {
		System.out.println("Cek");
	}
}
