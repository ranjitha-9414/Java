import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Student s1 = new Student(1, "Ranj", 22, 90);
		
		System.out.println(s1);
		
		String path = "C:\\KodnestJava\\Student.txt";
		
		FileOutputStream fos =  new FileOutputStream(path);
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(s1);
		
		System.out.println("Serialization completed");
		
		fos.close();
		oos.close();
	}

}
