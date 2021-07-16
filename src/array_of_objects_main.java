
public class array_of_objects_main {
	
	public static void main(String[] args) {
	array_of_objects[] objects = new array_of_objects[3];  //can mention no of array object going to insert
		array_of_objects food1 = new array_of_objects("Pizza");
		array_of_objects food2 = new array_of_objects("Burger");
		array_of_objects food3 = new array_of_objects("Sandwich");
		
//		array_of_objects[ ] objects = {food1, food2, food3};  // can also group all the array elements into the class object 
		objects[0] = food1;
		objects[1] = food2;
		objects[2] = food3;
		
		System.out.println(objects[0].name);
		System.out.println(objects[1].name);
		System.out.println(objects[2].name);
	}
 
	
	
}
