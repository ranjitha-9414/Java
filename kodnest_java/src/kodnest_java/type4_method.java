package kodnest_java;

public class type4_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int a=10,b=20; int res=add(a,b) -> it is also valid
		int sum = add(20,10);//argument
		System.out.println(sum);
	}
	static int add(int a, int b) {//parameters
		int res = a + b;
		return res;
	}

}
