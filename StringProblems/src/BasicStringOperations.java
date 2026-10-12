

public class BasicStringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = " KodNest Technologies ";
		String str1 = " ";
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.charAt(4));
		System.out.println(str.length());
		System.out.println(str.isEmpty());
		System.out.println(str1.isEmpty());
		System.out.println(str1.isBlank());
		System.out.println(str.trim());
		System.out.println(str.replace('g','z'));
		System.out.println(str.substring(5));
		System.out.println(str.substring(0,7 ));
		System.out.println(str.startsWith(" Kod"));
		System.out.println(str.endsWith("gies"));
		System.out.println(str.indexOf(" Tech"));
		System.out.println(str.indexOf('e'));
		System.out.println(str.lastIndexOf('e'));
		System.out.println(str.contains("KodNest "));
		
	}

}

