import java.util.Arrays;

public class VehicleDriver {

	public static void main(String[] args) {
		Car v1 = new Car();
		Car v2 = new Car(0, "mycar");
		Vehicle v3 = new Air();
		
		v1.canYouFly();
		v2.canYouFly();
		v3.canYouFly();
		
		int[] myi = {4, 3, 7, 1};
		System.out.println(Arrays.toString(myi));
		
		Vehicle[] myv = {v1, v2, v3};
		System.out.println(Arrays.toString(myv));
		
		ArrayList<Vehicle> arrList = new ArrayList<>(Arrays.asList(myv));
		
	}
}
