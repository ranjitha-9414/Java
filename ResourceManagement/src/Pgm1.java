import java.util.*;
public class Pgm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter a: ");
			int a = sc.nextInt();
			System.out.println("Entered number is: " +a);
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			sc.close();
		}
	}

}
