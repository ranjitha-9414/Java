package ComparatorInterface;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;


public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student(11, "Amit", 80.5);
		Student s2 = new Student(13, "Rohit", 70.5);
		Student s3 = new Student(12, "Mohit", 60.5);
		
		ArrayList<Student> al = new ArrayList();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		System.out.println(al);
		
		//SortingHelper sh = new SortingHelper();
		
		//Collections.sort(al,sh);
		Collections.sort(al, new SortingHelper());
		
		System.out.println(al);
	}

}
