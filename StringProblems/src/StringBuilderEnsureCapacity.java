
public class StringBuilderEnsureCapacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		sb.ensureCapacity(70);
		System.out.println(sb.capacity());
	}

}
