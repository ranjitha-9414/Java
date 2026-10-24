package ComparatorInterface;

import java.util.Comparator;

public class SortingHelper implements Comparator<Student> {
	
	public int compare(Student obj1, Student obj2) {
		return obj1.roll-obj2.roll;
	}

}
