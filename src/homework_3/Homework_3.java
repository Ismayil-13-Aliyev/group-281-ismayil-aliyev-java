package homework_3;

public class Homework_3 {
		public static void main(String[] args) {
			//1
			
			Student myStudent = new Student("Alex", 38, 4.5);
			
			myStudent.printInfo();
			
			//2
			
			Calculatir c = new Calculatir();
			
			int resultt = c.sum(4, 12);
			System.out.println(resultt);
			
			double resultAver = c.average(32.0, 34.0);
			
			System.out.println(resultAver);
			
			c.printMax(2, 97, 124, 3472);
		}
}
