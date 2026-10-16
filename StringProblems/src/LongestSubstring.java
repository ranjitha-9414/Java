import java.util.Scanner;

public class LongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		int maxLength=0;
		String longest ="";
		for(int i =0;i<str.length();i++) {
			String temp ="";
			
//			char ch = str.charAt(i);
//			if(str.indexOf(ch)!=i) {
//				continue;
//			}
			for(int j =i;j<str.length();j++) {
				
				char c = str.charAt(j);
				if(temp.indexOf(c)!=-1) {
					break;
				}
				temp = temp+c;
				if(temp.length()>maxLength) {
					maxLength = temp.length();
					longest = temp;
				}
			}
			
		
		}
		System.out.println("Longest substring: " + longest);
		System.out.println("Length: " + maxLength);
	}

}
