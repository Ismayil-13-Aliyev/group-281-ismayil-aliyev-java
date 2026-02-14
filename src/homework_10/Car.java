package homework_10;

public class Car extends Vehicle implements IDrivable, IStopable {	
	
	public Car(String name) {
		super(name);
	}

	@Override
	public void drive() {}

	@Override
	public void stop() {}
	
}
