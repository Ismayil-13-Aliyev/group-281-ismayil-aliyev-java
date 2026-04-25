package classwork_10;

public class Homework_10 {
	public static void main(String[] args) {
		//1
		
		Person p = new Person();
		p.name = "Alex";
		p.age = 21;
		
		System.out.println(p.name);
		System.out.println(p.age);
		
		//2
		
		Car c1 = new Car("BMW", 68);
		
		Car c2 = new Car("Mersedes", 12);
		
		System.out.println(c1.brand + " " + c1.year);
		System.out.println(c2.brand + " " + c2.year);
		
		//4
		
		Book b = new Book("BOK ^", "MS MAN");
		
		//5
		
		Student s3[] = {
			new Student("OGURCIK", 98),
			new Student("MALAKOS", 92323),
			new Student("KONAMI", 28936)
		};
		
		System.out.println(s3[0].name + " " + s3[0].grade);
		System.out.println(s3[1].name + " " + s3[1].grade);
		System.out.println(s3[2].name + " " + s3[2].grade);
	}
}
