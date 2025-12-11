import java.util.List;
import java.util.Vector;

public class Professor extends User {
	private String _department;
	private String _office;
	public Vector<Course> _teaches = new Vector<Course>();
	public Vector<Course> _assigned_to = new Vector<Course>();

	public boolean createCourse(Course aCourse) {
		throw new UnsupportedOperationException();
	}

	public boolean assignGrade(Student aStudent, Course aCourse, double aGrade) {
		throw new UnsupportedOperationException();
	}

	public List<Student> viewCourseStudent(Course aCourse) {
		throw new UnsupportedOperationException();
	}
}