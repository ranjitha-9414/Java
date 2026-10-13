
public class StringBuilderCapacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		
		StringBuffer sbr = new StringBuffer();
		System.out.println(sbr.capacity());
		
		sb.append("Java");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		sb.append(" is a programming language");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
	}

}
