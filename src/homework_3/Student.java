package homework_3;

public class Student {
	String name;
	int age;
	double averageGrade;
	
	public Student(String name, int age, double averageGrade) {
		this.name = name;
		this.age = age;
		this.averageGrade = averageGrade;
	}
	
	public void printInfo () {
		System.out.println("Name " + name + ", age " + age + ", average grade " + averageGrade);
	}
	
	//2
	
	public int sum(int a, int b) {
		return a + b;
	}
}
