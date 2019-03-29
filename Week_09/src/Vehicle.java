
abstract class Vehicle {
	private String name;
	private int capacity;
	
	public Vehicle() {
		capacity = 0;
		name = "myVehicle";
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public abstract Boolean isFlyable();
	
	
	public void canYouFly() {
		System.out.println("Name: " + getName() +
							"\nFlyable?: " + isFlyable());
		
	}
	
	
}
