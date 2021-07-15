
public class constructor_human {
	String name;
	String last_name = "sung";
	int age ;
	constructor_human(String name){
		this.name = name;  // this keyword is used bkz to assign this values to the class object 
		// only when it is assigned the value can be called and displayed
		System.out.println(last_name);  // can display the assigned value here 
		age = 28;  // but if any variable value is assigned without passing parameter in the constructor can be called without the need of this keyword
	}
	
	void eating() {
		System.out.println(this.name+ " Cow it was");  // to call the object attribute within class itself
	}
}
