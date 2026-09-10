
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		p1.name = "Ranj";
		p1.age = 21;
		System.out.println("Name: "+ p1.name +" Age: "+p1.age);
		
		p1.work();
		p1.sleep();
		
		Person p2 = new Person();
		p2.name = "anj";
		p2.age = 11;
		System.out.println("Name: "+ p2.name +" Age: "+p2.age);
		
		p2.work();
		p2.sleep();
	}

}
