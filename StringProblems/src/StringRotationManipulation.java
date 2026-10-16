import java.util.Scanner;

public class StringRotationManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		System.out.println("Enter the number of positions: ");
		int p = sc.nextInt();
		//sc.next();
		System.out.println("Enter the direction: ");
		String d = sc.next();
		String result ="";
		p = p%str.length();
		System.out.println(p);
		if(d.equalsIgnoreCase("Left")) {
			result = str.substring(p)+ str.substring(0, p);
		} else if(d.equalsIgnoreCase("right")) {
			result = str.substring(str.length()-p)+ str.substring(0,str.length()-p);
		} else {
			result = str;
		}
		System.out.println(result);
	}

}
