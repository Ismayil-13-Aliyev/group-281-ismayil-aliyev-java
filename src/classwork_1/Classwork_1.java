package classwork_1;

public class Classwork_1 {
	public static void main(String[] args) {
		// 1
		
		int age = 12;
		
		if (age < 18) {
			System.out.println("Can't go in");
		}
		
		// 2
		
		int temp = 26;
		
		if (temp > 0) {
			System.out.println("hot");
		} else {
			System.out.println("cold");
		}
		
		// 3
		
		int mark = 4;
		
		if (mark == 5) {
			System.out.println("Exelent");
		} else if (mark == 4) {
			System.out.println("Good");
		} else if (mark == 3) {
			System.out.println("Norm");
		} else if (mark == 2) {
			System.out.println("Bad");
		} else {
			System.out.println("Not possible");
		}
		
		// 4
		
		int month = 7;
		
		if (month == 12 || month == 1 || month == 2) {
			System.out.println("winter");
		} else if (month == 3 || month == 4 || month == 5) {
			System.out.println("spring");
		} else if (month == 6 || month == 7 || month == 8) {
			System.out.println("summer");
		} else if (month == 9 || month == 10 || month == 11) {
			System.out.println("outum");
		} else {
			System.out.println("error");
		}
		
		// 5
		
		int day = 3;
		
		switch (day) {
			case 1 -> System.out.println("Monday");
			case 2 -> System.out.println("Thirsday");
			case 3 -> System.out.println("Wendsday");
			case 4 -> System.out.println("Thurday");
			case 5 -> System.out.println("Friday");
			case 6 -> System.out.println("Saturday");
			case 7 -> System.out.println("Sunday");
		}
		
		// 6 ?
		
//		char otper = +;
		
		// 7 ?
		
//		int code = 895;
//		
//		if (code == ___) {
//			
//		}
		
		//8
		
		int sum = 1000;
		
		if  (sum >= 1000) {
			System.out.println(sum / 100 * 90);
		} else if (sum >= 500) {
			System.out.println(sum / 100 * 95);
		} else {
			System.out.println("No sale");
		}
		
		// 9
		
		int ror = 404;
		
		switch (ror) {
			case 404 -> System.out.println("Page not found");
			case 500 -> System.out.println("Server error");
			case 403 -> System.out.println("Can't go");
			default -> System.out.println("Something else");
		}
		
		//10
		
		tring grade = "A";
		
		
	}
}

