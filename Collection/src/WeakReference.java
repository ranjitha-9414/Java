import java.util.*;
public class WeakReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WeakHashMap<String, String> hm = new WeakHashMap<>();
		
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
