package HashCode;

import java.util.HashSet;

public class StudentApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student(11,"Arjun");
		Student s2 = new Student(12,"Ravi");
		Student s3 = new Student(11,"Arjun");
		
//		s1.display();
//		s2.display();
//		s3.display();
//		
//		System.out.println(s1.equals(s2));
//		System.out.println(s1.equals(s3));
		
		HashSet hs = new HashSet();
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		
		System.out.println(hs);
	}

}
