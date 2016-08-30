
public abstract class Human {
	protected String name,id;
	protected double number;
	public Human(String name, double number){
		this.name = name;
		this.number=number;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public abstract String getId();
	
	protected abstract void generateId();
}
