import java.util.Scanner;

public class Prime2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the sarting number: ");
		int start = sc.nextInt();
		System.out.println("Enter the Ending number: ");
		int end = sc.nextInt();
		if(start == 1) {
			start++;
		}
		for(int i=start;i<=end;i++) {
			if(findPrime(i)) {
				System.out.println(i);
			}
		}
	}
		static boolean findPrime(int n) {
			for(int i=2;i<=Math.sqrt(n);i++) {
				if(n%i==0) {
					return false;
				}
			}
			return true;
		
	}

}
