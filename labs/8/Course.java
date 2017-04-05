import java.util.ArrayList;
public class Course {
	private String CName;
	private ArrayList students;
public Course ( String CN) {
	CName=CN;
	students = new ArrayList();
}
public void addStudent (String stu) { 
	students.add(stu);
}
public ArrayList getStudents() { 
	return students;
}
public int getNumberOfStudents() { 
	return students.size();
}
public String getCourseName() { 
	return CName;
}
public void dropStudent (String stu) { 
	students.remove(stu);
}
public String toString() { 
	String s = "";
	s = CName + "(" + students.size() + " students) \n";
	for (int i = 0; i <students.size(); i ++) { 
		s += "(" + (i+1) + ")" + students.get(i) + "\n";
	}
	return s;
}
public void clear() { 
	students.clear();
}
}
