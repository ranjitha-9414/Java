import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path1 = "C:\\FebJava\\input.txt";
		String path2 = "C:\\FebJava\\output.txt";
		
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader(path1);
			fw = new FileWriter(path2);
			
			int data;
			
			while((data = fr.read())!= -1) {
				fw.write(data);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				if(fr!= null) fr.close();
				if(fw!=null) fw.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
