import java.util.ArrayList;

public class array_list {
	public static void main(String[] args) {
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("friedrice");
		food.add("parotta"); // adding on ArrayList
		food.add("tamako");
		
		food.set(0, "Maggi"); //setting over existing array
		food.remove(2);// remove the array of mentioned index
		food.clear(); // clears the entire array
		
		for(int i=0; i<food.size(); i++) {   // normal array has length but AL has size
			System.out.println("Array " +i+ " is: "+food.get(i));  // to get the AL elements
		}
		
		
	}
}
