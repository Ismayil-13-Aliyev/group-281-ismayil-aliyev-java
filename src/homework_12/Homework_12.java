package homework_12;

public class Homework_12 {
	public static void main(String[] args) {
		
		//1
		
		byte a_1 = 23;
		short a_2 = 2938;
		int a_3 = 983298;
		long a_4 = 98237912;
		float a_5 = 2.23f;
		double a_6 = 13.0;
		boolean a_7 = false;
		String a_8 = "Hello bro";
		
		//2
		
		long population = 8_100_000_000L; // _ znacit 1000, L nado cto bi pokazat cto eto long
		System.out.println(population);
		
		//3
		
		float f = 1.23f; // f cto bi pokazat cto eto float
		double d = 1.23;
		
		System.out.println(f + " " + d);
		
		//4
		
		char grade = 'B';
		boolean ready = true;
		
		char nl = '\n';
		
		System.out.println(nl);
		System.out.println("konec");
		
		//5
		
		int t = 5; //Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	//	The local variable t may not have been initialized

	//	at Lessons_281/homework_12.Homework_12.main(Homework_12.java:43)
		
		System.out.println(t);
	}
}
