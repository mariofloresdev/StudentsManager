

public class Group {
	private int capacity, size, number;
	Student[] studentsList;
	private String grade, id;
	
	
	public Group(String grade, int number, int cap){
		if(cap<=0)
			cap=15;
		this.capacity=cap;
		studentsList = new Student[capacity];
		generateId();
		size = 0;
	}
	
	//returns false if group capacity is met
	public boolean addStudent(Student s){
		if(size>=capacity){
			return false;
		}
		studentsList[size]=s;
		size++;
		
		return true;
	}
	
	public int getGroupSize(){
		return size;
	}
	
	private void generateId(){
		id = grade + Integer.toString(number);
	}

}
