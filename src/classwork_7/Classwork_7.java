package classwork_7;

import java.util.Arrays;

public class Classwork_7 {
	public static void main(String[] args) {
		//2
		
		double[] prices = {45.6, 19.9, 99.4, 8.2, 150.7, 33.1, 67.8, 12.5, 200.0, 55.3};
		
		System.out.println("Prices in store:");
		
		double sumOfPrices = 0;
		
		Toy_store t = new Toy_store();
		
		for(double pric : prices) {
			long celPrice = t.round(pric);
			System.out.println("Toys price before: " + pric + "Toys price after: " + celPrice);
			sumOfPrices += celPrice;
		}
		
		sumOfPrices /= 10;
		
		sumOfPrices = t.round(sumOfPrices);
		
		System.out.println("Okrug cena: " + sumOfPrices);
		
		//3
		
		int[] balls = {120, 85, 200, 95, 150, 60, 175, 110};
		
		int best = balls[0];
		int worst = balls[0];
		
		for(int i = 0; i < balls.length; i++) {
			best = Math.max(best, balls[i]);
			worst = Math.min(best, balls[i]);
		}
		System.out.println("Best: " + best);
		System.out.println("Worst: " + worst);
		
		int raznica = best -= worst;
		
		System.out.println("Raznica: " + raznica);
		
		if(raznica > 100) {
			System.out.println("So wigth");
		}
		
		//4
		
		int[] sqrt = {5, 8, 3, 10, 6};
		
		System.out.println("Ploshdi kvadratov:");
		
		Figuri f = new Figuri();
		
		for(int sq : sqrt) {
			sq = f.ploshdkv(sq);
			System.out.println(sq);
		}
		
		System.out.println("Ploshdi pramougolnikov:");
		
		double p1 = f.ploshdpr(4, 6);
		double p2 = f.ploshdpr(7, 3);
		double p3 = f.ploshdpr(9, 2);
		double p4 = f.ploshdpr(5, 5);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		
		double[] allp = {p1, p2, p3, p4};
		
		System.out.println(Arrays.stream(allp).max().getAsDouble());
		
		//5
		
		
	}
}
