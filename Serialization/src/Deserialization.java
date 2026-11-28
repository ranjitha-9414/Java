import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Deserialization {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		String path = "C:\\KodnestJava\\Student.txt";
		
		FileInputStream fis =  new FileInputStream(path);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Student student = (Student)ois.readObject();
		
		System.out.println(student);
		
		fis.close();
		ois.close();
	}

}
