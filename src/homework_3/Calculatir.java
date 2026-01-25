package homework_3;

import java.util.Arrays;

public class Calculatir {
	public int sum(int a, int b) {
		return a + b;
	}
	
	public double average(double ...numbers) {
		int sum = 0;
		
		for (double d : numbers) {
			sum+=d;
		}
		
		return sum / numbers.length;
	}
	
	public void printMax(int ...values) {
		if (values.length == 0) {
			System.out.println("errror");
		} else {
			int maxN = Arrays.stream(values).max().getAsInt();
			System.out.println(maxN);
		}
	}
}
