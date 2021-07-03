import java.util.Random;
public class random_number {
	public static void main(String[] args) {
		Random random = new Random();
		int a = random.nextInt(6)+1;  //generates random number between 0-5, by adding +1 it generates up-to 6
//		can also use this for double,boolean
		System.out.println(a);
	}
}
