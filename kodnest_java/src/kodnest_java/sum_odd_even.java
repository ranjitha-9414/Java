package kodnest_java;

import java.util.Scanner;

public class sum_odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int evenSum = 0;
		int oddSum = 0;
		for(int i =1;i<=n;i++) {
			if(i %2 ==0) {
				System.out.println("Even number: "+i);
				evenSum +=i;
			} else {
				System.out.println("Odd number: " + i);
				oddSum += i;
			}
			System.out.println("Sum of Even number: "+evenSum);
			System.out.println("Sum of Odd number: "+oddSum);
			
		}
	}

}
