package classwork_5;

import java.util.Arrays;

public class Classwork_5 {
	public static void main(String[] args) {
		//1 
		
		for (int i = 1; i <= 20; i++) {
			System.out.println(i);
		}
		
		//2
		
		for (int a = 10; a >= 1 ; a--) {
			System.out.println(a);
		}
		
		//3
		
		for (int m = 1; m <= 30 ; m++) {
			if (m % 2 == 0) {
				System.out.println(m);
			}
		}
		
		//4
		
		for (int p = 1; p <= 10; p++) {
			System.out.println("6 " + "* " + p + " " + "= " + p*6);
		}
		
		//5
		
		int count = 1;
		
		while (count <= 15) {
			System.out.println(count);
			
			count++;
		}
		
		//6
		
		int b = 5;
		
		do {
			System.out.println(b);
			b++;
		} while (b <= 25);
		
		//7
		
		int sum = 0;
		
		for (int r = 1; r <= 20; r++) {
			sum += r;
		}
		
		System.out.println(sum);
		
		//8
		
		int sum2 = 0;
		
		for (int t = 1; t <= 30; t++) {
			if (t % 2 != 0) {
				sum2 += t;
			}
		}
		
		System.out.println(sum2);
		
		//11
		
		System.out.println("**********");
		
		//12
		
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		
		//13
		
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("*****");
	}
}
