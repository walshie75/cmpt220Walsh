import java.util.ArrayList;

public class TestCourse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course c1 =new Course ( "Java Programming");
		Course c2 = new Course ("Multimedia");
		c1.addStudent("Peter Jones ");
		c1.addStudent(" Brian Smith");
		c1.addStudent("Anne Kennedy ");
		c1.addStudent("Ryan Walsh");
		c2.addStudent("Hunter Keith ");
		c2.addStudent("Steven Smith ");
		c2.addStudent("John Jones");
		System.out.println("Number of students in course 1: " 
		+ c1.getNumberOfStudents());
		ArrayList a1 = c1.getStudents();
		for (int i=0; i < c1.getNumberOfStudents(); i++)
			System.out.print(a1.get(i) + ",");
		System.out.println();
		ArrayList a2 = c2.getStudents();
		for (int i=0; i < c2.getNumberOfStudents(); i++)
			System.out.print(a2.get(i) + ",");
		System.out.println();
		c1.dropStudent("Ryan Walsh");
		System.out.println("\nNew list of course 1 after the dropping of student:"
		+ c1);
		c2.clear();
		System.out.println("\n New Course 2 list after using the clear() method:" + c2);
	}
	}


