import java.io.BufferedReader;
import java.io.BufferedWriter;
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
		
		BufferedReader br  = null;
		BufferedWriter bw = null;
		
		try {
			fr = new FileReader(path1);
			fw = new FileWriter(path2);
			
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
			String data;
			
			while((data = br.readLine())!= null) {
			bw.write(data);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				
				if(br!= null) br.close();
				if(bw!= null) bw.close();
				
				if(fr!= null) fr.close();
				if(fw!=null) fw.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Done.........");
	}

}
