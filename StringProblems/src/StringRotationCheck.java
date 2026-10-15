import java.util.Scanner;

public class StringRotationCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String1: ");
		String str1 = sc.nextLine();
		System.out.println("Enter the String2: ");
		String str2 = sc.nextLine();
		
		if(str1.length()!= str2.length()) {
			System.out.println("The string '" + str2 + "' is not a rotation of '" + str2+"'." );
		} else {
			String combinedStr = str1 + str1;
			
			if(combinedStr.contains(str2)) {
				System.out.println("The string '" + str2 + "' is  a rotation of '" + str2+"'." );
			} else {
				System.out.println("The string '" + str2 + "' is not a rotation of '" + str2+"'." );
			}
		}
	}

}
