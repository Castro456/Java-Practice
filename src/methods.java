
public class methods {
	public static void main(String[] args) {
		
		String name = "Zac";
		int age = 21;
		hello(name,age); // arguments are the one passed to the method
	}
	
	static void hello(String name, int age) {  // parameters are the one that gets the arguments
		System.out.println("Hello "+name);
		System.out.println("Age "+age);
	}
}
