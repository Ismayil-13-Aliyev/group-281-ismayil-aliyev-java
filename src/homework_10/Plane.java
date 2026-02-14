package homework_10;

public class Plane extends Vehicle implements IDrivable, IStopable, IFlyable {

	public Plane(String name) {
		super(name);
	}

	@Override
	public void drive() {}

	@Override
	public void stop() {}

	@Override
	public void fly() {}

}
