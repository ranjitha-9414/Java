import java.util.Scanner;

public class LongestPalindromicString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		String longest ="";
		for(int i =0;i<str.length();i++) {
			String temp="";
			for(int j =i+1;j<=str.length();j++) {
				temp = str.substring(i, j);
				String rev="";
				for(int k=temp.length()-1;k>=0;k--) {
					rev=rev+temp.charAt(k);
				}
				if(temp.equals(rev)) {
					if(temp.length()>longest.length()) {
						longest = temp;
					}
				}
			}
		}
		System.out.println(longest );
	}

}
