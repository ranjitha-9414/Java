package kodnest_java;

public class type3_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = add();
		System.out.println(sum);//System.out.println(add());
	}
	static int add() {
		int a = 10;
		int b = 20;
		int res = a + b;
		return res;
	}
}
