import java.util.Scanner;

public class TripleStringTransformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String1: ");
		String s1 = sc.nextLine();
		System.out.println("Enter the String2: ");
		String s2 = sc.nextLine();
		System.out.println("Enter the String3: ");
		String s3 = sc.nextLine();
		System.out.print(s1.replaceAll("[aeiouAEIOU]", "%")); 
		System.out.print(s2.replaceAll("[^aeiouAEIOU]", "#"));
		System.out.print(s3.toUpperCase());
	}

}
