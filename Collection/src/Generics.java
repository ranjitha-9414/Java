import java.util.ArrayList;

public class Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		System.out.println(al);
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Ranj");
		al1.add("Ram");
		System.out.println(al1);
	}

}
