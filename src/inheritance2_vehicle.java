
public class inheritance2_vehicle extends inheritance1_car {
	// This class just inherits the values for the class inheritance1_car
	void checking() {   // This method is just owned by this class
		System.out.println(speed); // But the value in there is extends for the old class
	}
}
