import java.util.Scanner;

public class Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  String: ");
		String s = sc.nextLine();
		if(s.matches("[a-zA-Z0-9]*")) {
			System.out.println("It is valid, it is matching");
		} else {
			System.out.println("It is invalid, it is not matching");
		}
	}

}
