import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int fact =1;
		for(int i=1;i<=n;i++) {
			fact *=i;
		}
		System.out.println("Factorial for : "+n+" "+fact);
		
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		System.out.println("Factorial for : "+num+" "+fact(num));
	}
	static int fact(int n) {
		if(n<0) {
			return 0;
		} else if(n==0) {
			return 1;
		} else {
			return n*fact(n-1);
		}
	}

}
