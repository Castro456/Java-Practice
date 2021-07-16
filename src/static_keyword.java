
public class static_keyword {
	
	String name;
	static int friends = 5;
	static_keyword(String name){
		this.name = name;
		friends ++;
	}
	
	static void friendcount() {
		System.out.println("You have " +friends+"friends");
	}
}
