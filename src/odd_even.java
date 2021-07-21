import java.util.*;
public class odd_even {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:  ");
		int a = scanner.nextInt();
		scanner.close();
		if(a%2 == 0) {
//			System.out.println("Even number");
			if(a >= 2 && a <= 5) {
				System.out.println("Not Weird");
			}
			else if(a >= 6 && a <= 20){
				System.out.println("Weird");
			}
			else if (a >20) {
				System.out.println("Not Weird");
			}
		}
		else {
			System.out.println("Weird");
		}
	}
}
