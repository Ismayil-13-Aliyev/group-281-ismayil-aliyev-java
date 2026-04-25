package classwork_10;

public class Student {
	String name;
	int grade;
	
	Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}
	
	public void printInfo() {
		System.out.println("I am " + name + "My grade is " + grade);
	}
}
