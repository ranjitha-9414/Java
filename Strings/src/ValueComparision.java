
public class ValueComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Ranj";
		String s2 = "Ranj";
		String s5 = "RANJ";
		
		String s6 = new String("Ranj");
		String s3 = new String("Virat");
		String s4 = new String("Virat");
		
		if(s1.equals(s2)) {
			System.out.println("Values are same.");
		} else {
			System.out.println("Values are not same.");
		}

		if(s3.equals(s4)) {
			System.out.println("Values are same.");
		} else {
			System.out.println("Values are not same.");
		}

		if(s1.equals(s3)) {
			System.out.println("Values are same.");
		} else {
			System.out.println("Values are not same.");
		}
		
		if(s1.equals(s5)) {
			System.out.println("Values are same.");
		} else {
			System.out.println("Values are not same.");
		}
		
		if(s1.equals(s6)) {
			System.out.println("Values are same.");
		} else {
			System.out.println("Values are not same.");
		}
	}

}
