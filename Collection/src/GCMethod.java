
public class GCMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Hello World";
		System.out.println(s);
		
		s= null;
		
		System.gc();
		System.out.println(s);
	}

}
