package kodnest_java;

public class StudentApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Student s1 = new Student();
			s1.name = "Ranjitha";
			s1.rollno = 91;
			System.out.println(s1.name+ " "+ s1.rollno);
			s1.study();
			s1.run();
	}

}
