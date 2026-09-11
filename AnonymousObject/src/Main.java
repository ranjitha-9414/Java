
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.name = "Ranj";
		s1.age = 21;
		
		System.out.println(s1.name);
		System.out.println(s1.age);
		
		s1.study();
		
		new Student().study();
		
		System.out.println(new Student().age);
		System.out.println(new Student().name);
		
	}

}
