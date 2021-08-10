import java.math.BigDecimal;
import java.util.Scanner;

public class float_exponential {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double c = sc.nextDouble();
		BigDecimal bd = new BigDecimal("1234567890");
		System.out.println(bd.doubleValue());

		// If you are sure that's not a floating point number, then use
		System.out.println(bd.longValue()); 
		sc.close();
		
		// Answer is :
		System.out.printf("%e",c);
	}

}
