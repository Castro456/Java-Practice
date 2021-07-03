import java.util.Scanner;

public class nested_loop_with_symbol {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the row: ");
		int row = scanner.nextInt();
		
		System.out.println("Enter the Column: ");
		int column = scanner.nextInt();	
		
		System.out.println("Enter the Symbol: ");
		String symbol = scanner.next();
		
		for(int i=1; i<=row; i++) {
			System.out.println();
			for(int y=1; y<=column; y++) {
				System.out.print(symbol);
			}
		}
		scanner.close();
	}
}
