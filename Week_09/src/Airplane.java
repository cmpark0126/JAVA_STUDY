
public class Airplane extends Vehicle{
	private int numWheels;
	
	public Airplane() {
		numWheels = 3;
		super.setName("myAirplane");
	}
	
	@Override
	public Boolean isFlyable() {
		return true;
	}
}
