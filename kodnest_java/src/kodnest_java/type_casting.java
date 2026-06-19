package kodnest_java;

public class type_casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//implicit conversion
		byte a = 55;
		short b;
		b = a;
		System.out.println(b);
		int a1= 98765;
		double b1=a1;//implicit
		System.out.println(a1);
		System.err.println(b1);
		short a2=56;
		byte b2 = (byte)a2;//Explicit
		System.out.println(b2);
		double a3= 9876.456;
		int b3 = (int) a3;
		System.out.println(b3);//data loss might occur 
		/*float a4 = 123.45f;
		long b4 = a4;long b4 = (long) a4;//explicit
		System.out.println(b4);*/
		char a5 = 'A';
		int b5 = a5;//implicit
		System.out.println(b5);//ASCII
		int a6 = 98;
		char b6 = (char) a6;
		System.out.println(b6);
		
	}

}
