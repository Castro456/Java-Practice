
public class main {
	public static void main(String[] args) {
		
		car_object mycar = new car_object();  // calling the class file of name car_object using an object
		String car = "RedBull";
		
		System.out.println(mycar.name);  // calling those variables using the object
		
		mycar.engine(car);  // calling that file method and passing an argument
		
	}
}
