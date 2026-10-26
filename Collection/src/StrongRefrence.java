import java.util.*;
public class StrongRefrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> hm = new HashMap<>();
		
		String key1 = new String("Key1");
		String key2 = new String("Key2"); 
		
		hm.put(key1, "Value1");
		hm.put(key2, "Value2");
		
		System.out.println(hm);
		
		key1= null;
		System.gc();
		
		System.out.println(hm);
	}

}
