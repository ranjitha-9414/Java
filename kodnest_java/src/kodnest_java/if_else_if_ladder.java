package kodnest_java;
import java.util.*;
public class if_else_if_ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		if(n > 0) {
			System.out.println("positive number");
		}
		else if(n< 0) {
			System.out.println("negative number");
		}
		else {
			System.out.println("zerooooo");
		}
	}

}
