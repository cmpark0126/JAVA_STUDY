import java.util.Comparator;

public class Student implements Comparable<Student> {
	private String name;
    private int ID;
    private int year;

    // constructor
    Student(String name, int id, int year){
    	this.name = name;
    	this.setID(id);
    	this.setYear(year);
    }
    
    // getters, setters  
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
    public int getID() {
		return ID;
	}

	public void setID(int id) {
		this.ID = id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
    
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (ID != other.ID)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

    @Override
    public String toString() {
      return name + ID + "-" + year;
    }

    @Override
    public int compareTo(Student otherStudent) {
        return (this.getID() - otherStudent.getID());
    }
    
	// Create a static object called studentIDComparator
   	public static Comparator<Student> studentIDComparator = new Comparator<Student>() {
   		@Override
   		public int compare(Student a, Student b) {
   			return a.getID() - b.getID();
   		}
   	};

}
