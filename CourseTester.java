public class CourseTester {
	
	public static void main(String[] args){
		Course biol = new Course("Biol");
		Teacher me = new Teacher("Me",1);
		for(int index = 0; index<10; index++){
			biol.createInstance(me);
			System.out.println(biol.instances.get(biol.instances.size()-1).getId());
		}
	}

}
