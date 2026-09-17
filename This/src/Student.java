
public class Student {

	int age;
	String name;
	double height;
	
	Student(double height, String name, int age) {
		this.age = age;
		this.name = name;
		this.height = height;
		
	}
	
	void disp() {
		System.out.println(age);
		System.out.println(name);
		System.out.println(height);
	}
}
