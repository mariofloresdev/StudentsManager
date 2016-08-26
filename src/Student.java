

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;

public class Student {
	
	private String name, id;
	private float gpa;
	
	Student(String name, int number, float gpa){
		this.setName(name);
		this.setGpa(gpa);
		generateId(number);
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getGpa() {
		return gpa;
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	
	public String getId(){
		return id;
	}
	
	private void generateId(int number){
		DateFormat df = new SimpleDateFormat("yyyy");
		Date date = new Date();
		Formatter f = new Formatter();
		
		System.out.println();
		id = (df.format(date)+"-"+f.format("%03d", number));
		f.close();
		
		
	}

}
