import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i = 0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		
		int sum = 0;
		
		for(int i = 0; i< arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.print("Array: [");
		for(int i = 0; i< arr.length;i++) {
			if(i <size -1) {
				System.out.print(arr[i] + ", ");
			} else {
				System.out.print(arr[i]);
			}
		}
		System.out.println("]");
		System.out.println("Sum: " + sum);
	}

}
