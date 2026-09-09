import java.util.Scanner;

public class Fibnaaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n: ");
		int n = sc.nextInt();
		if(n<0) {
			System.out.println("Please Enter a positive number.");
			return;
		}
		System.out.print("The fibnaaci series are ");
		for(int i=1;i<=n;i++) {
			System.out.print(fib(i)+" ");	
		}
	}
	static int fib(int n) {
		if(n<=1) {
			return n;
		}
		return fib(n-1)+fib(n-2);
		
	}

}
