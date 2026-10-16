import java.util.Scanner;

public class ToggleEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		String t="";
		for(int i =0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch)) {
				t = t+Character.toLowerCase(ch);
			} else if(Character.isLowerCase(ch)) {
				t = t+Character.toUpperCase(ch);
			} else {
				t =  t+ch;
			}
			
		}
		System.out.print(t);
	}

}
