import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int a[] = new int[size];
		for(int i = 0; i<a.length;i++) {
			a[i] = sc.nextInt();
		}
//		int revArray[] = new int[a.length];
//		int j = revArray.length-1;
//		for(int i =0; i<a.length;i++) {
//			revArray[j] = a[i];
//			j--;
//		}
		int revArray[] = new int[a.length];
		int j = 0;
		for(int i =a.length -1;i>=0;i--) {
			revArray[j] = a[i];
			j++;
		}
		System.out.print("Original array: [");
		for(int i = 0; i<a.length;i++) {
			if(i < a.length-1) {
				System.out.print(a[i] + ", ");
			} else {
				System.out.print(a[i]);
			}
		}
		System.out.println("]");
		
		System.out.print("Reversed array: [");
		for(int i =0;i<revArray.length;i++) {
			if(i <revArray.length-1) {
				System.out.print(revArray[i] + ", ");
			} else {
				System.out.print(revArray[i]);
			}
		}
		System.out.println("]");
	}

}
