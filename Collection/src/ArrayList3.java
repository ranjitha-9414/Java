import java.util.ArrayList;

public class ArrayList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println("Using for loop: ");
		for(int i =0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("Enhanced for loop");
		for(Object x: al) {
			System.out.println(x);
		}
	}

}
