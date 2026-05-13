package classwork_12;

public class Dog {
	String name;
	String breed;
	int age;
	
	public Dog (String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	
	public void bark() {
		System.out.println(name + " govorit: Gav!");
	}
	
	public void introduce() {
		System.out.println("Name: " + name + ", breed: " + breed + ", age:" + age);
	}
}
