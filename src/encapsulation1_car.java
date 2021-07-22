
public class encapsulation1_car {
	private String name;
	private int age;
	
	encapsulation1_car(String name, int age){
		this.setName(name); // passing to this method to get the name, in class instance itself this method gets executed
		this.age = age;
	}
	// Getters
	public String getName() {  //To print the private values
		System.out.println("It is in the get name");  
		return name;  // In here this.name and name is same
	}
	
	public int getAge() {
		return age;
	}
	// Setters
	public String setName(String name) {  // To change those private values
		return this.name = name;
	}
}
