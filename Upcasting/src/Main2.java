
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JavaDeveloper jd = new JavaDeveloper();
		accessMethod(jd);
		
		PythonDeveloper pd = new PythonDeveloper();
		accessMethod(pd);
	}
	
	static void accessMethod(Developer dev) {
		dev.work();
		dev.project();
	}

}
