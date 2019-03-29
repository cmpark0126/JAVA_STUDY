
public abstract class Vehicle {
	private int capacity;
	private String name;
	
	public Vehicle() {
		this(0, "myVehicle");
	}
	
	public Vehicle(int capa, String name) {
		capacity = capa;
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract Boolean isFlyable();
	
	public void canYouFly() {
		  System.out.println("Name:" + getName() + 
				  "Flyable?:" + isFlyable());  
	}
}

class Car extends Vehicle {
	private int numWheels;
	
	public Car() {
		this(0, "myCar");
	}
	
	public Car(int capa, String name) {
		super(capa, name);
		numWheels = 4;
	}

	@Override
	public Boolean isFlyable() {
		// TODO Auto-generated method stub
		return null;
	}

}

class Air extends Vehicle {
	private int numWheels;
	
	public Air() {
		this(0, "myAir");
	}
	
	public Air(int capa, String name) {
		super(capa, name);
		numWheels = 3;
	}
	
	@Override
	public Boolean isFlyable() {
		return true;
	}
	
	@Override
	public String toString() {
		return "Air" + "[" + getName() + "]";
	}
}


