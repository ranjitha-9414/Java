
public class Student {

	int roll;
	String name;
	
	Student() {
		roll = 1;
		name = "Raja";
	}
	
	Student(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}
	
	Student(int roll) {
		this.roll = roll;
	}
	
	void display() {
		System.out.println(roll);
		System.out.println(name);
	}
}
