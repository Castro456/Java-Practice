
public class string_methods {
	public static void main(String[] args) {
		
//		Important String methods
		String name = "Zac";
//		boolean check= name.equalsIgnoreCase("zac"); //equals check with case sensitive
//		char check = name.charAt(0);  //this returns the char
//		int check = name.indexOf('a');  //returns the index
//		can use uppercase and lower case, trim method removes all the empty spaces
		String check = name.replace('c', 'k'); // replace the old char
		System.out.println(check);
	}
}
