import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String1: ");
		String str1 = sc.nextLine();
		System.out.println("Enter the String2: ");
		String str2 = sc.nextLine();
		
		boolean result = isAnagram(str1,str2);
		System.out.println(result);
	}
	public static boolean isAnagram(String s1 , String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
		char arr1[] = s1.toCharArray();
		char arr2[] = s2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		String sortS1 = new String(arr1);
		String sortS2 = new String(arr2);
		
		if(sortS1.equalsIgnoreCase(sortS2)) {
			return true;
		} else {
			return false;
		}
	}
 
}
