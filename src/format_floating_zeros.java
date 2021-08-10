import java.util.Scanner;

public class format_floating_zeros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println();
//		See console it wont popup for scanner but it keeps ready
		float d = sc.nextFloat();
//		System.out.printf("%.2f",d);
		String ans = String.format("%s", d);
		System.out.println(ans);
		sc.close();
		
	}

	
}
