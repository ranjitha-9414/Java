import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String path1 = "C:\\FebJava\\input.txt";
		String path2 = "C:\\FebJava\\output.txt";
		
		 FileInputStream fis = new FileInputStream(path1);
		 FileOutputStream fos = new FileOutputStream(path2);
		 
		 int data;
		 
		 while((data = fis.read()) != -1) {
			 fos.write(data);
		 }
		 
		 fis.close();
		 fos.close();
	}

}
