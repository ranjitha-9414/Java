import java.util.Scanner;

public class SplitAndJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		String word[] = text.split(" ");
		for(int i = 0;i<word.length;i++) {
			System.out.println(word[i]);
		}
		
	}

}
