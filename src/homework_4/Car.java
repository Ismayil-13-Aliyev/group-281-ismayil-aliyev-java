package homework_4;

public class Car {
	Engine engine;
	String model;
	
	public Car (Engine engine, String model) {
		this.engine = engine;
		this.model = model;
	}
	
	public void printDetails () {
		System.out.println("Engine: " + engine + ", model: " + model);
	}
}
