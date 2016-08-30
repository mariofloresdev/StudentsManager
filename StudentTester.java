

import java.util.Calendar;

public class StudentTester {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(1995, 07, 25);
		Student s = new Student("Mario", 1, 3.70f);
		System.out.println(s.getId());
		s = new Student("Mario", 2, 3.70f);
		System.out.println(s.getId());
	}

}
