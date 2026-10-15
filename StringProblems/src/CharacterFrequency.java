import java.util.Scanner;

public class CharacterFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s = sc.nextLine();
		System.out.println("Character occureneces: ");
		for(int i =0;i<s.length();i++) {
			char ch = s.charAt(i);
			int count =0;
			if(s.indexOf(ch)!= i) {
				continue;
			}
			for(int j=0;j<s.length();j++) {
				if(ch == s.charAt(j)) {
					count++;
				}
			}
			System.out.println(ch +": " + count);
		}
	}

}
