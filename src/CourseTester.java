public class CourseTester {
	
	public static void main(String[] args){
		Course c = new Course("Biol"), m = new Course("Mate");
		
		Teacher t = new Teacher("Bernardo",25);
		t.addCourse(c);
		c.setHours(7, 30, 8, 20);
		
		t.addCourse(m);
		m.setHours(8, 30, 9, 20);
		if(m.getTo().isAfter(c.getFrom()))
				System.out.println("Yes");
		
		for(Course course: t.courses){
			System.out.println(course.getName()+" From "+course.getFrom()+" To " +course.getTo());
		}
	}

}
