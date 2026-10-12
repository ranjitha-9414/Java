import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int size = str.length();
		
		char arr[] = str.toCharArray();
		char revArr[] = new char[size];
		
		int j = revArr.length-1;
		for(int i = 0;i<arr.length;i++) {
			revArr[j]=arr[i];
			j--;
		}
		String revStr = new String(revArr);
		if(str.equals(revStr)) {
			System.out.println("It is a palindrome");
		} else {
			System.out.println("It is not a palindrome.");
		}
		
		
		System.out.println("Original Array: " + str);
		System.out.println("Reversed Array: " + revStr);
	}

}
