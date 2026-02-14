package homework_10;

public class Bus extends Vehicle implements IDrivable, IStopable {

	public Bus(String name) {
		super(name);
	}

	@Override
	public void drive() {}

	@Override
	public void stop() {}

}
