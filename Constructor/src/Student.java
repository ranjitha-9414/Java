
public class Student {
	int age;
	String name;
	double height;
	
	Student (int a, String n, double h) {
		age = a;
		name = n;
		height = h;
	}

	void disp() {
		System.out.println(age);
		System.out.println(name);
		System.out.println(height);
	}
}
