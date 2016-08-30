import java.util.ArrayList;


public class Course {
	protected String name;
	ArrayList<Teacher> teachers;
	ArrayList<CourseInstance> instances;
	
	public Course(String name){
		this.name = name;
		teachers = new ArrayList<>();
		instances = new ArrayList<>();
	}
	
	public void addTeacher(Teacher t){
		teachers.add(t);
	}
	
	public String getName(){
		return name;
	}
	
	public void createInstance(Teacher t){
		CourseInstance ci =new CourseInstance(this, instances.size()+1 );
		ci.setTeacher(t);
		instances.add(ci);
		
	}


	
	

}
