
public class super2_power extends super1_hero{
	String power;
	
	super2_power(String name, int age, String power){
		super(name, age);
//		this.name = name;
//		this.age = age;
		this.power = power;
		}
	public String toString() {
		return super.toString() + "\n" + power;  // super.toString() to call the parent class toString()
	}
}
