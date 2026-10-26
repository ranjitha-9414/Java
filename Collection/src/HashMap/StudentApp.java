package HashMap;
import java.util.*;
public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(11, "Amit", 87.5);
		Student s2 = new Student(12, "Amit", 68.5);
		Student s3 = new Student(13, "Rohit", 78.5);
		
		HashMap hm = new HashMap();
		hm.put(1, s1);
		hm.put(2, s2);
		hm.put(3, s3);
		
		System.out.println(hm);
		
		System.out.println("Keys: ");
		Set res1 = hm.keySet();
		Iterator itr1 = res1.iterator();
		
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		System.out.println("Values: ");
		Collection res2 = hm.values();
		Iterator itr2 = res2.iterator();
		
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		System.out.println("Key-Value: ");
		Set res3 = hm.entrySet();
		Iterator itr3 = res3.iterator();
		
		while(itr3.hasNext()) {
			System.out.println(itr3.next());
		}
		
//		System.out.println();
//		System.out.println("Enhanced for Loop: ");
//		for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {
//			System.out.println(entry.getKey() + " " + entry.getValue());
//		}
	}

}
