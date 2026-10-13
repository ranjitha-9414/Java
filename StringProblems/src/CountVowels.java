import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Text: ");
		String str = sc.nextLine();
		String str1 = str.toLowerCase();
		int count = 0;
		for(int i = 0;i<str1.length();i++) {
			char ch = str1.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		System.out.println("ORiginal String: " + str);
		System.out.println("Vowels count: " + count);
	}

}
