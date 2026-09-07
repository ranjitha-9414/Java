
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1234;
		int rev =0;
		for(int i=n;i>0;i= i/10) {
			int rem = n%10;
			 n=n/10;
			rev=rev*10+rem;
		}
		System.out.println(rev+" ");

	}

}
