import java.util.Scanner;
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a byte value: ");
		byte a = sc.nextByte();
		System.out.println("Byte value of a : "+a);
		
		System.out.println("Enter a short value : ");
		short b = sc.nextShort();
		System.out.println("Short value of b : " + b);
		
		System.out.println("Enter a integer value : ");
		int c = sc.nextInt();
		System.out.println("Integer value of c: "+ c);
		
		System.out.println("Enter a Long value : ");
		long d= sc.nextLong();
		System.out.println("Long value of d: "+ d);
		
		System.out.println("Enter a float value : ");
		float e = sc.nextFloat();
		System.out.println("Float value of e: "+ e);
		
		System.out.println("Enter a Double value: ");
		double f = sc.nextDouble();
		System.out.println("Double value of f :"+ f);
		
		System.out.println("Enter a Boolean value : ");
		boolean g = sc.nextBoolean();
		System.out.println("Boolean value of g: "+ g);
		
		System.out.println("Enter your name: ");
		String h = sc.next();
		System.out.println("Your name is: "+h);
		
		sc.nextLine();
		System.out.println("Enter your  Fullname: ");
		String i = sc.nextLine();
		System.out.println("Your Fullname: "+i);
		
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		System.out.println("Age is: "+ age);
		
		System.out.println("Enter your Height  is: ");
		float height =sc.nextFloat();
		System.out.println("Height is: "+height);
	}

}
