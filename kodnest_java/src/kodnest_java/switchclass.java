package kodnest_java;
import java.util.*;
public class switchclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		switch(num)
		{
			case 1 :
				System.out.println("One");
				break;
			case 2 :
				System.out.println("Two");
				break;
			case 3 :
				System.out.println("Three");
				break;
			default:
				System.out.println("Invalid");
		}
	}

}
