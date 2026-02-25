package classwork_8;

import java.util.Scanner;

public class Classwork_8 {
	public static void main(String[] args) {
		//1
		
		int number = 68;
		
		if (number % 2 == 0) {
			System.out.println("Cetnoe");
		} else if (number % 2 != 0) {
			System.out.println("Necetnoe");
		} else if (number == 0) {
			System.out.println("0");
		}
		
		//2
		
		int ball = 98;
		
		if (ball >= 90 && ball <= 100) {
			System.out.println("Amazing");
		} else if (ball >= 75 && ball <= 89) {
			System.out.println("Good");
		} else if (ball >= 60 && ball <= 70) {
			System.out.println("Norm");
		} else if (ball <= 59 && ball >= 0) {
			System.out.println("Bad");
		} else if (ball > 100 || ball < 0) {
			System.out.println("Error");
		}
		
		//3
		
		//?
		
		//4
		
		int price = 2938;
		
		if (price >= 5000) {
			price = price / 100 * 15;
		} else if (price >= 2000) {
			price = price / 100 * 10;
		} else if (price >= 1000) {
			price = price / 100 * 5;
		}
		
		System.out.println(price);
		
		//5
		
		//?
		
		//6
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		int n = s.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(n + " * " + i + " = " + i*n);
		}
		
		//7
		
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter number");
		int b = s2.nextInt();
		int sum = 0;
		int kol = 0;
		
		for (int a = 1; a <= b; a++) {
			sum += a;
			kol++;
		}
		System.out.println(sum);
		System.out.println(kol);
		
		//8
		
		//?
		
		//9
		
		Rectangle r1 = new Rectangle(70.0, 2.0);
		r1.printInfo();
		Rectangle r2 = new Rectangle(12.0, 7.0);
		r1.printInfo();
		
		//1
		
		int day = 3;
		
		if(day == 1 || day == 2 || day == 3 || day == 4 || day == 5) {
			System.out.println("Budniy");
		} else if(day == 6 || day == 7) {
			System.out.println("Vixodnoy");
		} else {
			System.out.println("Error");
		}
		
		//2
		
		int age = 13;
		
		if(age >= 0 && age <= 2) {
			System.out.println("Mladenec");
		} else if(age >= 3 && age <= 6) {
			System.out.println("Doshkolnik");
		} else if(age >= 7 && age <= 10) {
			System.out.println("Mladsh shkolnik");
		} else if(age >= 11 && age <= 14) {
			System.out.println("Podrost mladsh");
		} else if (age >= 15 && age <= 17) {
			System.out.println("Podrost starsh");
		} else if (age >= 18 && age <= 64) {
			System.out.println("Vzrosliy");
		} else if(age >= 65) {
			System.out.println("Staric");
		} else if(age < 0) {
			System.out.println("Error");
		}
		
		//3
		
		//?
		
		//4
		
		//?
		
		//5
		
		//?
		
		//6
		
		//?
		
		//7
	}
}
