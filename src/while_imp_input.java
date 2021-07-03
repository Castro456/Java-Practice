import java.util.Scanner;

public class while_imp_input {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name ="";
		
		while(name.isEmpty()) {
			System.out.println("Enter your name: ");
			name = scanner.nextLine();
		}
		System.out.println("Your name is  "+name);
		scanner.close();
	}
}
