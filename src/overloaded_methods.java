
public class overloaded_methods {
	public static void main(String[] args) {
		System.out.println(checking(5,7,12));  //can also use int, double, char  are anything that returns the same datatype
	}
	
	static int checking(int a, int b) {
		System.out.println("Method one");
		return a+b;
	}
	static int checking(int a, int b, int c) {
		System.out.println("Method two");
		return a+b+c;
	}
	static int checking(int a, int b, int c, int d) {
		System.out.println("Method three");
		return a+b+c+d;
	}
}
