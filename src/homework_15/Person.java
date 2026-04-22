package homework_15;

public class Person {
	String name;
	int age;
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	Person (String name) {
		this.name = name;
	}
	
	Person (int age) {
		this.age = age;
		if(age < 18) {
			System.out.println("DDostup zapreshon");
		}
	}
}
