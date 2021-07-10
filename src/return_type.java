
public class return_type {
	public static void main(String[] args) {
		int a = 44;
		int b = 22;
		String d = "zac"; 
		int c = numbers(a,b);
		System.out.println(c);
		System.out.println(stringing(d));
	}
	
	static int numbers(int a, int b) {
		return a + b;   //  void dont return values so use specific datatype to get the return values
	}
	
	static String stringing(String d) {
		return d;
	}
}
