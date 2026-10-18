import java.util.ArrayList;
import java.util.Iterator;

public class ArraryList4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		System.out.println("Accessing elements using for loop");
		System.out.print("[");
		for(int i =0;i<al.size();i++) {
			if(i<al.size()-1) {
				System.out.print(al.get(i)+ ", ");
			} else {
				System.out.print(al.get(i));
			}
		}
		System.out.println("]");
		
		System.out.println("Accessing elements using iterablee interface");
		
		Iterator itr = al.iterator();
		System.out.print("[");
		while(itr.hasNext()) {
			System.out.print(itr.next());
			if(itr.hasNext()==true) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

}
