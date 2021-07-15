
public class constructor_human_main {
	
	public static void main(String[] args) {
		constructor_human me1 = new constructor_human("Sam");
		constructor_human me2 = new constructor_human("Holly");
		System.out.println(me1.name);
		System.out.println(me2.name);
		me1.eating();
		me2.eating();
	}
}
