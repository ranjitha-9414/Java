import java.util.Scanner;

public class ExtractDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		String resStr="";
		for(int i =0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch >='0' && ch<= '9') {
				resStr = resStr + ch;
			}
		}
		System.out.println("Extracted Digits: " + resStr);
	}

}
