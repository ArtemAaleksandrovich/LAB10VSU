import java.util.List;
import java.util.Vector;

public class Student extends User {
	private String _studentId;
	private int _year;
	public Vector<Enrollment> _has = new Vector<Enrollment>();
	public Vector<Course> _enroll_in = new Vector<Course>();
	
	public Student(String studentId, int year) {
        this._studentId = studentId;
        this._year = year;
    }

	public boolean enrollCourse(Course aCourse) {
		throw new UnsupportedOperationException();
	}

	public List<Grade> viewGrades() {
		throw new UnsupportedOperationException();
	}

	public Schedule viewSchedule() {
		throw new UnsupportedOperationException();
	}
}