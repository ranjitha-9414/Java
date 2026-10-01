
public class Employee implements Work, Project{

	@Override
	public void working() {
		System.out.println("Working");
	}
	
	@Override
	public void doProject() {
		System.out.println("Doing Project");
	}
}
