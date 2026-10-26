import java.util.*;
public class IdentitiyMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = new String("Key");
		String s2 = new String("Key");
		
//		HashMap hm = new HashMap();
//		
//		hm.put(s1, "Value1");
//		hm.put(s2, "Value2");
//		
//		System.out.println(hm);
		
		IdentityHashMap ihm = new IdentityHashMap();
		
		ihm.put(s1, "Value1");
		ihm.put(s2, "Value2");
		
		System.out.println(ihm);
	}

}
