
public class Car extends Vehicle{
	private int numWheels;
	
	public Car() {
		numWheels = 4;
		super.setName("myCar");
	}
	
	@Override
	public Boolean isFlyable() {
		return false;
	}
	
}
