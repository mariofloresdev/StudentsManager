

import java.text.DecimalFormat;
import java.util.Formatter;

public class Student extends Human{
	private float gpa;
	
	Student(String name, double number, float gpa){
		super(name,number);
		this.setGpa(gpa);
		generateId();
		
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
	
	protected void generateId(){
		Formatter f = new Formatter();
		DecimalFormat df = new DecimalFormat("000");
		
		id = ("Student-"+df.format(number));
		f.close();
		
		
	}

}
