import java.util.ArrayList;
import org.joda.time.LocalTime;

public class Course {
	private String name;
	ArrayList<Teacher> teachers;
	private LocalTime from, to;
	public Course(String name){
		this.name = name;
		teachers = new ArrayList<>();
	}
	
	public void setHours(int fromHour, int fromMinute, int toHour, int toMinute){
		setFrom(new LocalTime(fromHour, fromMinute));
		setTo(new LocalTime(toHour, toMinute));
	}
	
	
	public void addTeacher(Teacher t){
		teachers.add(t);
	}
	
	public String getName(){
		return name;
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
	
	

}
