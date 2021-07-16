
public class static_keyword_main {
	
	public static void main(String[] args) {
		static_keyword name = new static_keyword("Sam");
		static_keyword name1 = new static_keyword("Ram");
		System.out.println(name.name);
		System.out.println(name1.name);
		System.out.println(static_keyword.friends);// in there now need to call the class method static var/met don't need it
		// can also access the static variable with named instance (class object) but its not the best practice
		static_keyword.friendcount();// same for methods
	}
}
