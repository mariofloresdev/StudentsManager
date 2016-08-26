

public class GroupTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Group[] groups = new Group[3]; //groupList
		Student[] list = new Student[45]; //student List
		int studentCount, groupCount; //counters
		studentCount = groupCount = 1;
		
		for(int index=0; index<list.length; index++){ //Creates students
			list[index] = new Student("Mario", studentCount, 3.70f);
			studentCount++;
		}
		
		int pos = 0; //position in groups
		boolean good = true; //can add students
		Group g = new Group("10",groupCount,30); //create a new Group
		groups[pos]=g; //add new Group to list
		pos++; //advance a position
		groupCount++;
		
		for(int index=0; index<list.length; index++){ //for every student
			good = g.addStudent(list[index]); //try to add student to current group
			if(!good){ //if group is full
				System.out.println("New Group");
				g = new Group("10", groupCount, 30); //create new group
				groups[pos]=g; // add new group to list
				g.addStudent(list[index]); //add student to new group
				pos++; //advance in groups position
			}
		}
		
		for(int index=0; index<pos; index++){ //for every group created
			System.out.println(groups[index].getGroupSize()); //print group size
			System.out.println("Last Student Id");
			System.out.println(groups[index].studentsList[groups[index].getGroupSize()-1].getId());
		}

	}

}
