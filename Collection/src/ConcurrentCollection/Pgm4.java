package ConcurrentCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Pgm4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CopyOnWriteArrayList<Integer> al = new CopyOnWriteArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
//		for(int i: al) {
//			System.out.print(i + " ");
//			al.add(99);
//		}
//		System.out.println();
//		System.out.print(al);
		
//		for(int i = 0; i<al.size(); i++) {
//			System.out.print(al.get(i)+ " ");
//			al.add(99);
//		}
//		
//		System.out.println();
//		System.out.print(al);
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
			al.add(99);
		}
		System.out.println();
		System.out.print(al);
	}

}
