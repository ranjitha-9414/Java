import java.util.Scanner;

public class RemoveVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		System.out.println(str.replaceAll("[aeiouAEIOU]", ""));
	}

}
