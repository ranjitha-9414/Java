
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=6;
		int count = 0;
		 if (num ==1) {
			System.out.println("1 cannot be prime number.");
		} 
		 for(int i= 2;i<=num;i++) {
			 if(num%i==0) {
				 count++;
			 }
		 }
		 if(count > 1) {
			 System.out.println("Not a Prime number");
		 } else {
			 System.out.println(" prime number");
		 }

	}

}
