import java.util.*;
public class foreach {
	public static void main(String[] args) {
//		String[] fruits = {"apple", "pineapple", "banana"};
		ArrayList<String> animals= new ArrayList<String>();
		animals.add("cat");
		animals.add("dog");
		animals.add("rat");
		
		for(String i : animals){
			System.out.println(i);
		}
	}
}
