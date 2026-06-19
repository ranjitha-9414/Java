package kodnest_java;

public class Bitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var a=5;
		var b=3;
		var c=6;
		var d=8;
		var res=a|b;
		var bit_and=a&b; 
		var left_shift=c<<2;
		var right_shift=d>>2;
		var xor=a^b;
		var not=~a;
		System.out.println(res);
		System.out.println(bit_and);
		System.out.println(left_shift);
		System.out.println(right_shift);
		System.out.println(xor);
		System.out.println(not);

	}

}
