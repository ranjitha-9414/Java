import java.util.Scanner;

public class CapitalizeFirstLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s = sc.nextLine();
		String ch[] = s.split(" ");
		for(int i=0;i<ch.length;i++) {
			//char ch = s.charAt(0);
			System.out.print(Character.toUpperCase(ch[i].charAt(0)) );
			
			
				System.out.print(ch[i].substring(1).toLowerCase());
			
			System.out.print(" ");
		}
		System.out.println();
		System.out.println("Different pattern : ");
		for(int i=0;i<ch.length;i++) {
			//char ch = s.charAt(0);
			System.out.print(Character.toUpperCase(ch[i].charAt(0)) );
			for(int j=1;j<ch[i].length();j++) {
				System.out.print(ch[i].charAt(j));
			}
			System.out.print(" ");
		}
	}

}
