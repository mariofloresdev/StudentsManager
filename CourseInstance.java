import java.text.DecimalFormat;

import org.joda.time.LocalTime;

public class CourseInstance extends Course{
	private LocalTime from, to;
	private Teacher teacher;
	private String id;
	private int number;
 	
	public CourseInstance(Course course, int number){
		super(course.getName());
		this.number=number;
		generateId();
	}
	
	public CourseInstance(String name, int number) {
		super(name);
		this.number = number;
		generateId();
	}
	

	
 	public void setHours(int fromHour, int fromMinute, int toHour, int toMinute){
		setFrom(new LocalTime(fromHour, fromMinute));
		setTo(new LocalTime(toHour, toMinute));
	}
	
	public LocalTime getTo() {
		return to;
	}

	public void setTo(LocalTime to) {
		this.to = to;
	}

	public LocalTime getFrom() {
		return from;
	}

	public void setFrom(LocalTime from) {
		this.from = from;
	}
	
	public void generateId() {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("00");
		id = name+df.format(number);
		
	}
	
	 public String getId(){
		 return id;
	 }
	
	
	public void setTeacher(Teacher t){
		this.teacher=t;
	}
	
	public Teacher getTeacher(){
		return teacher;
	}
	
	public String getTeacherName(){
		return teacher.name;
	}
	
	
}
