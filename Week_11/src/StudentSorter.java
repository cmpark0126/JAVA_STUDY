import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentSorter {
	public static void main(String[] args) {
	    List<Student> group = new ArrayList<>();
	    Student Student1 = new Student("John", 32, 3);
	    Student Student2 = new Student("Moon", 42, 1);
	    Student Student3 = new Student("Park", 21, 4);
	    group.add(Student1);
	    group.add(Student2);
	    group.add(Student3);

	    System.out.println("Before Sorting : " + group);
	    
	    Collections.sort(group, new StudentIDComparator());
	    System.out.println("After Sorting by id : " + group);
	    
	    Collections.sort(group, new StudentYearComparator());
	    System.out.println("After Sorting by year : " + group);
	    
	    Collections.sort(group, new StudentNameComparator());
	    System.out.println("After Sorting by name : " + group);
	}
}