package homework_15;

public class Dog {
	String name;
	int age;
	
	Dog (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void bark() {
		System.out.println("Woof! I am " + name);
	}
}
