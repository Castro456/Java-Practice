import java.util.Scanner;

public class hypotenuse {
	public static void main(String[] args) {
		double x;
		double y;
		double z;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter x angle: ");
		x = scanner.nextDouble();
		System.out.println("Enter y angle: ");
		y = scanner.nextDouble();
		
		z = Math.sqrt((x*x)+(y*y)); //formal for hypotenuse of a triangle
		System.out.println("Hypotenuse of a triangle is "+z);
		scanner.close();
				
	}
}
