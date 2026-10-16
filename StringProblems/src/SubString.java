import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		for(int i =0;i<str.length();i++) {
			String temp ="";
			for(int j=i;j<str.length();j++) {
				temp = temp+str.charAt(j);
				System.out.println(temp);
			}
			System.out.println();
		}
	}

}
