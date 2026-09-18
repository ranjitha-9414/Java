
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student(1, "Ajay");
		s1.display();
		
		Student s2 = new Student(s1);
		s2.display();
		
		Student s3 = new Student(s2);
		s3.display();
	}

}
