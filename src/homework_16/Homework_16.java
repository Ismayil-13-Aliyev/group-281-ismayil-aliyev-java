package homework_16;

public class Homework_16 {
	public static void main(String[] args) {
		//1
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE + 1);
		//samoe maksimalnoe i minimalnoe znaceniye inta
		
		//2
		
		//int a = 1/0;					//Exception in thread "main" -2147483648
		//System.out.println(a);		//java.lang.ArithmeticException: / by zero at Lessons_281/homework_16.Homework_16.main(Homework_16.java:13)
										
		double b = 1.0/0.0;                 //Infinity
		System.out.println(b);
		
		//3
		
		//?
		
		//4
		
		int a2 = 100000;
		int b2 = 100000;
		
		System.out.println((long)a2*b2);
		System.out.println(a2*b2);
		
		//5
		
		double nan = 0.0/0.0;
		
		System.out.println(nan == nan);
		System.out.println(Double.isNaN(nan));
		
		
		
		
		
		//1
		
		//eto risunok, ne mogu v eclipse sdelat
		
		//2
		
		int a3 = 5;
		int b3 = a3;
		b3++;
		
		System.out.println(a3);
		System.out.println(b3);
		
		//3
		
		StringBuilder sb1 = new StringBuilder("A");         //sb1 i sb2 ravni, oni vedut v odno mesto
		StringBuilder sb2 = sb1;
		sb2.append("B");
		
		System.out.println(sb1);
		
		//4
		
		System.out.println("a"+"b" == "ab");
		System.out.println("ab".equals("ab"));
		
		//5
		
		//?
	}
}
