
public class print {
	public static void main(String[] args) {
		
		boolean boolean1 = true; // same for using char, int , String
		double mydouble = 5000;
		final double pi = 3.14;  // Once this final is assigned those values cannot be updated.
		
		System.out.println(pi);
		
		System.out.printf("%b Boolean can also be printed ",boolean1);
		
		//Conversion Character
		System.out.println();
		System.out.printf("%d This is a number ",234);
		
		// Width
		System.out.println();		
		System.out.printf(" This is a number %10d",234);
		
		// Precision
		System.out.println();	
		System.out.printf("This is a double value is  %2f",mydouble);
		
		// Flags
		System.out.println();	
		// - left-justify
		// + for the symbol, but if  the varible declared itself is a negative no. this displays as negative
		// 0 numeric values are  zero padded in the gap between
		// ,  add comma if the value is > 1000
		System.out.printf("This is a double value is  %,f",mydouble);
	}
}
