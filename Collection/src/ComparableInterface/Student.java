package ComparableInterface;

public class Student implements Comparable<Student> {

	public int compareTo(Student obj) {
		return this.roll - obj.roll;
	}
	
	int roll;
	String name;
	double marks;
	
	public Student(int roll, String name, double marks) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	
	public String toString() {
		return roll + " " + name + " " + marks;
	}
}
