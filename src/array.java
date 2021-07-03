
public class array {
	public static void main(String[] args) {
		String[] phones = {"oneplus" ,"samsung","hauwai"};
		System.out.println(phones[0]);
		
		String[] cars = new String[3];
		cars[0] = "Ford";
		cars[1] = "Mustang";
		cars[2] = "Hyundai";
		
		for(int i=0; i<cars.length;i++) {
			System.out.println(cars[i]);
		}
	}
}
