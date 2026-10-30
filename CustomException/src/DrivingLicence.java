import java.util.*;

public class DrivingLicence {

	int age;
	
	void takeUserAge() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age: ");
		age = sc.nextInt();
	}
	
	void verify() throws UnderAgeException, OverAgeException {
		if(age <18) {
			throw new UnderAgeException();
		}else if(age>65) {
			throw new OverAgeException();
			
		}
		else {
			System.out.println("Driving License issued.");
		}
	}
}
