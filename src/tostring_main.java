
public class tostring_main {
	public static void main(String[] args) {
		tostring movies = new tostring();
		// if call is made to class without mentioning for specific var or method using class obj , it returns class address
		System.out.println(movies); // Implicitly
		System.out.println(movies.toString()); // Explicitly
	}
}
