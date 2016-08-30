import java.util.Formatter;
import java.text.*;

public class Teacher extends Human{
	public Teacher(String name, double number) {
		super(name, number);
		generateId();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return id;
	}

	protected void generateId() {
		// TODO Auto-generated method stub
		Formatter f = new Formatter();
		DecimalFormat df = new DecimalFormat("000");
		id = "teacher-"+df.format(number);
		
	}
	
	
}
