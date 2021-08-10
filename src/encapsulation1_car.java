
public class encapsulation1_car {
	private String name;
	private int age;
	
	encapsulation1_car(String name, int age){
		this.setName(name); // passing to this method to get the name, in class instance itself this method gets executed
		this.setAge(age);
	}
	
	encapsulation1_car(encapsulation1_car x){
		this.copy(x); //Calling copy method in constructor for second class instance
	}
	
	// Getters
	public String getName() {  //To print the private values
//		System.out.println("It is in the getName method");  
		return name;  // In here this.name and name is same
	}
	
	public int getAge() {
		return age;
	}
	
	// Setters
	public void setName(String name) {  // To change those private values
		 this.name = name;  // Can also use return fn but it is not needed bkz only getter are going to print the values
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	//Copy Objects
	public void copy(encapsulation1_car x) {
		this.setName(x.getName()); // Same concept setters runs first and passing class instance to get getters
		this.setAge(x.getAge());
	}
}
