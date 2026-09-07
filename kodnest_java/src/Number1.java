import java.util.Scanner;

public class Number1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		if(num>0) {
			System.out.println(num+ "is a poistive number.");
		} else if(num<0) {
			System.out.println(num+" is a negative number.");
		} else {
			System.out.println(num +" is a zero." );
		}
	}

}
