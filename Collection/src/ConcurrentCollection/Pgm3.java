package ConcurrentCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class Pgm3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			al.add(99);
		}
	}

}
