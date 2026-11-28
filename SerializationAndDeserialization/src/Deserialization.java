import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		String path = "C:\\KodnestJava\\Employee.txt";
		
		FileInputStream fis = new FileInputStream(path);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Employee e1 = (Employee) ois.readObject();
		
		System.out.println(e1);
		
		fis.close();
		ois.close();
	}

}
