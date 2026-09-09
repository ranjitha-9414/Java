import java.util.Scanner;

public class Prime1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		findPrime(n);

	}
	static void findPrime(int n) {
		int count = 0;
		if(n==1) {
			System.out.println(n+" is not a Prime number");
			return;
		}
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				count++;
			}
			
		}
		if(count==0) {
			System.out.println(n+" is a Prime number.");
		} else {
			System.out.println(n+" is not a Prime number.");
		}
	}

}
