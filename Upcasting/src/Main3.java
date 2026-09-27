
public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		accessMethod(new JavaDeveloper());
		accessMethod(new PythonDeveloper());
	}
	
	static void accessMethod(Developer dev) {
		dev.work();
		dev.project();
	}

}
