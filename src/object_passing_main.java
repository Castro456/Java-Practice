
public class object_passing_main {
	
	public static void main(String[] args) {
		object_passing1 car = new object_passing1("Tesla"); // passing an argument to the class constructor
		
		object_passing2 car1 = new object_passing2();  // creating class obj for another class 
		car1.parking(car); // calling the method of the class object_passing2 and passing the argument of class obj of another class
		
	}
}
