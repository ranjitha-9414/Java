import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Employee e1 = new Employee(1, "Ranj", 30000, "IT", 1234567890);
		System.out.println(e1);
		
		String path = "C:\\KodnestJava\\Employee.txt";
		
		FileOutputStream fos = new FileOutputStream(path);
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(e1);
		
		fos.close();
		oos.close();
	}

}
