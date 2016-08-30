import java.text.DecimalFormat;
import java.util.ArrayList;

public class Teacher extends Human{
	ArrayList<CourseInstance> coursesInstances;
	public Teacher(String name, double number) {
		super(name, number);
		coursesInstances = new ArrayList<>();
		generateId();
		// TODO Auto-generated constructor stub
	}
	
	public void addCourse(CourseInstance c){
		this.coursesInstances.add(c);
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return id;
	}

	protected void generateId() {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("000");
		id = "teacher-"+df.format(number);
		
	}
	
	
}
