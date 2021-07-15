import java.util.Random;

public class variable_scope {
	Random random; // Global variable
	int number = 0;
	
	variable_scope(){
		random = new Random();
		roll();
	}
	
	void roll() {
		int another_number = 10;   // Local variable 
		number = random.nextInt(6);
		System.out.println(number);
		System.out.println(another_number);
	}

}
