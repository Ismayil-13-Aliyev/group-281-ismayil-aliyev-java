package homework_9;

public class Homework_9 {
	public static void main(String[] args) {
		//1
		
		int sumOfGrades = 0;
		int numberOffi = 0;
		
		GradesLesson g = new GradesLesson();
		for(int i = 1; i <= 20; i++) {
			double grade = g.randomGrade();
			System.out.println("Lesson: " + i + " grade: " + grade);
			sumOfGrades += grade;
			if(grade == 5) {
				numberOffi += 1;
			}
		}
		double average = sumOfGrades / 20;
		
		System.out.println("Average grade: " + Math.round(sumOfGrades / 20));
		
		System.out.println("Number of fives: " + numberOffi);
		
		//2
		
		double[] temperatures = {18.4, 19.7, 17.2, 20.9, 16.8, 21.3, 18.1};
		
		System.out.println("Tempiratures in the week:");
		
		int mostHot = -100;
		int mostCold = 100;
		
		WeekTempirature w = new WeekTempirature();
		
		for(double temperature : temperatures) {
			temperature = w.rounds(temperature);
			System.out.println("Tempirature: " + temperature);
			Math.max(mostHot, temperature);
			Math.min(mostCold, temperature);
		}
		
		System.out.println(mostHot);
		System.out.println(mostCold);
		
		double raznica = mostHot - mostCold;
		
		System.out.println("Raznica: " + raznica);
		
		//3
		
		//? posmotrite v Saver
		
		//4
		
		PloshadHome p = new PloshadHome();
		
		double p1 = p.pH(4.5, 3.2);
		double p2 = p.pH(5.0, 4.0);
		double p3 = p.pH(3.8, 3.5);
		double p4 = p.pH(6.1, 2.9);
		double p5 = p.pH(4.2, 4.2);
		
		double[] pss = {p1, p2, p3, p4, p5};
		
		System.out.println("Ploshad komnat: ");
		
		double obshplosh = 0.0;
		
		for(double ps : pss) {
			ps = p.pH(ps, ps);
			System.out.println(ps);
		}
		
		//? Ya poosmotrel v google tam tem sposobom kotoriy mi ne proxodili
		
		//5
		
		// taje problema tam v google sposob kotoriy mi ne proxodili
		
		//6
		
		double sumKv = 0;
		
		for(int e = 1; e <= 12; e++) {
			double n = Math.round(Math.random() * 20);
			System.out.println(n);
			double m = Math.pow(n, 2);
			System.out.println(m);
			if(m > 100) {
				System.out.println("Big number");
			}
			sumKv += m;
		}
		
		System.out.println(sumKv);
		
		System.out.println(Math.round(sumKv));
		
		//7
		
		int[] numbers = {1, 25, 38, -558, -7, 76, 31, -69, -4, 14};
		
		System.out.println("Numbers azd their absolutes:");
		
		int best = -1000000001;
		int worst = -111;
		int sumOfNumbers = 0;
		
		for(int number : numbers) {
			int anumber = Math.abs(number);
			System.out.println("Number: " + number + " absolute: " + anumber);
			best = Math.max(best, anumber);
			worst = Math.min(worst, anumber);
			sumOfNumbers += anumber;
		}
		
		System.out.println(best);
		System.out.println(worst);
		
		int raznicac = best - worst;
		
		System.out.println(raznicac);
		
		System.out.println(sumOfNumbers);
		
		//8
		
		int[] radiuses = {1, 2, 3, 4, 5, 6, 7};
		
		System.out.println("Ploshadi krugov:");
		
		diferentCircles d =  new diferentCircles();
		
		double bes = -1.0;
		double wors = 92873243.2;
		double sumr = 0;
		
		for(double radius : radiuses) {
			radius = d.pK(radius);
			System.out.println(radius);
			wors = Math.min(wors, radius);
			bes = Math.max(bes, radius);
			sumr += radius;
		}
		System.out.println(bes);
		System.out.println(wors);
		
		bes = Math.round(bes);
		wors = Math.round(wors);
		
		System.out.println(bes);
		System.out.println(wors);
		
		System.out.println(sumr);
		
		//9
		
		int countOfs = 0;
		
		for(int t = 1; t <= 15; t++) {
			double num = Math.round(Math.random() * 10);
			System.out.println(num);
			
			double ceil = Math.ceil(num);
			double floor = Math.floor(num);
			
			if(num < 5) {
				System.out.println("Mal cis");
			}
			if(num > 7) {
				countOfs += 1;
			}
		}
		
		System.out.println(countOfs);
		
		//10
		
		double number = 56.0;
		
		for(int y = 1; y <= 10; y++) {
			double pop = Math.round(Math.random() * 100);
			System.out.println("Popitka: " + y + " cislo: " + pop);
			if(pop > number) {
				System.out.println("Too big");
			} else if(pop < number) {
				System.out.println("Too small");
			} else if(pop == number) {
				System.out.println("Ugadal!");
				break;
			}
		}
		
		System.out.println(number);
	}
}
