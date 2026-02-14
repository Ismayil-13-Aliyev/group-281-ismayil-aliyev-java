package homework_10;

public class Jet extends Vehicle implements IDrivable, IStopable, IFlyable {

	public Jet(String name) {
		super(name);
	}

	@Override
	public void drive() {}

	@Override
	public void stop() {}

	@Override
	public void fly() {}

}
