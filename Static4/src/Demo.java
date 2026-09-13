
public class Demo {

	static int count = 0;
	{
		System.out.println("1st non-static block executed..");
		count++;
	}
	
	 {
		System.out.println("2nd non-static block executed..");
		count++;
	}
	
	 {
		System.out.println("3rd non-static block executed..");
		count++;
	}
	
}
