package kodnest_java;
import java.util.*;
public class if_else_constructs {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		if(num > 0) {
			System.out.println(num + " is a positive number");
		}
		else {
			System.out.println(num + " is a negative number");
		}
		
	}

}
