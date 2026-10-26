package ConcurrentCollection;
import java.util.*;
public class Pgm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		for(int i: al) {
			System.out.println(i);
			al.add(99);
		}
	}

}
