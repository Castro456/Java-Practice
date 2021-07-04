import java.util.*;
public class array_list_2d {
	public static void main(String[] args) {
		
		ArrayList<ArrayList<String>> total_list = new ArrayList<ArrayList<String>>(); //to put an AL within an AL
		
		ArrayList<String> foods = new ArrayList<String>();  //can also write as ArrayList(). But this is good
		foods.add("pasta");
		foods.add("maggie");
		
		ArrayList<String> drinks = new ArrayList<String>();
		drinks.add("coca-cola");
		drinks.add("dew");
		
		ArrayList<String> phone = new ArrayList<String>();
		phone.add("oneplus");
		phone.add("samsung");
		
		// Must add those arraylist to this arraylist
		total_list.add(foods);
		total_list.add(drinks);
		total_list.add(phone);
		
		System.out.println(total_list.get(0).get(1)); // to get an array element within an array
	}
}
