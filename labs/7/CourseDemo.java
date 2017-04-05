
public class CourseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] currentStudents;
		Course course = new Course("Computer Graphics");
		course.addStudent("Ryan Walsh");
		course.addStudent("Hunter Keith");
		course.addStudent("Kari Grip");
		System.out.println("The students enrolled in the course.");
		currentStudents = course.getStudents();
		for(int i = 0; i < course.getNumberOfStudents(); i++);
		System.out.print(currentStudents[i] + " , ");
		System.out.println();
		course.dropStudent(" Hunter Keith");
		System.out.println("\nHunter Keithe has removed from the course");
		System.out.println("\nThe remaining students in the course:");
		currentStudents = course.getStudents();
		for(int i = 0; i <course.getNumberOfStudents(); i++)
			System.out.print(currentStudents[i] + " , ");
		System.out.println();
	}

}
