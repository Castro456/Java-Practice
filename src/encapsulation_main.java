
public class encapsulation_main {
	public static void main(String[] args) {
//		Encapsulation is to access private attributes
		encapsulation1_car car = new encapsulation1_car("Zac", 22);
		car.setName("Sam");// to set a new name
		System.out.println(car.getName());
		System.out.println(car.getAge());
	}
}
