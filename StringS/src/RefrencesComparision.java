
public class RefrencesComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Ranj";
		String s2 = "Ranj";
		
		String s3 = new String("Virat");
		String s4 = new String("Virat");
		
		if(s1 == s2) {
			System.out.println("Refrences are same.");
		} else {
			System.out.println("Refrences are not same.");
		}

		if(s3 == s4) {
			System.out.println("Refrences are same.");
		} else {
			System.out.println("Refrences are not same.");
		}

		if(s1 == s3) {
			System.out.println("Refrences are same.");
		} else {
			System.out.println("Refrences are not same.");
		}
		
	}

}
