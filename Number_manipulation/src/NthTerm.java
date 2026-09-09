import java.util.Scanner;

public class NthTerm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nth term: ");
		int num = sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum +=i;
		}
		System.out.println("The "+num+"th term is "+sum);
		
		//Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int nth =n*(n+1)/2;
		System.out.println("The "+n+"th term is "+nth);

	}

}
