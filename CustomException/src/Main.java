
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrivingLicence dl = new DrivingLicence();
		dl.takeUserAge();
		try {
			dl.verify();
		} 
		catch(UnderAgeException e ) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		catch(OverAgeException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
