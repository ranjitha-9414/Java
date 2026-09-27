
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Developer dev1;
		JavaDeveloper jd = new JavaDeveloper();
		dev1 = jd;
		
		dev1.work();
		dev1.project();
		
		Developer dev2 = new PythonDeveloper();
		dev2.work();
		dev2.project();
	}

}
