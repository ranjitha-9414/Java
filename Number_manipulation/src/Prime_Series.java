import java.util.Scanner;

public class Prime_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		int start = sc.nextInt();
		int end = sc.nextInt();
		int count = 0;
		System.out.println("The prime numbers between "+start+" and "+end+" are:");
		for(int i=start;i<=end;i++) {
			for(int j=1;j<=i/2;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count <=1 && i!=1) {
				System.out.println(i);
			}
			count=0;
		}

	}

}
