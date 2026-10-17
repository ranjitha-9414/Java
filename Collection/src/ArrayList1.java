import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();
		System.out.println("Initial size: " + al.size());
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add("Raja");
		al.add(34.5);
		al.add('c');
		al.add(true);
		System.out.println(al);
		System.out.println(al.size());
		
	}

}
