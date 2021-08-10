
public class encapsulation_main {
	public static void main(String[] args) {
//		Encapsulation is to access private attributes
		encapsulation1_car car = new encapsulation1_car("Zac", 22);
		
//		encapsulation1_car car1 = new encapsulation1_car("Sid", 21);  // This is the another method of doing copy objects
//		car1.copy(car);
		// car1 = car2 // This cannot be given bkz this takes same address of the class 1
		
		encapsulation1_car car1 = new encapsulation1_car(car);
		car.setName("Sam");// to set a new name
		
		System.out.println(car);
		System.out.println(car1);
		System.out.println();
		System.out.println(car.getName());
		System.out.println(car.getAge());
		System.out.println();
		System.out.println(car1.getName());
		System.out.println(car1.getAge());
	}
}
