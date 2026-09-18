
public class Student {

	int roll;
	String name;
	
	Student(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}
	
	Student(Student ref) {
		roll = ref.roll;
		this.name = ref.name;
	}
	
	void display() {
		System.out.println(roll);
		System.out.println(name);
	}
}
