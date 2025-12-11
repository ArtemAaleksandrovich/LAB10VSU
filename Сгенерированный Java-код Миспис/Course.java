import java.util.Vector;

public class Course {
	private String _courseId;
	private String _name;
	private int _credits;
	private int _maxStudents;
	private int _currentStudents;
	public Professor _teaches;
	public Vector<Enrollment> _for_4 = new Vector<Enrollment>();
	public Vector<Student> _enroll_in = new Vector<Student>();
	public Vector<Professor> _assigned_to = new Vector<Professor>();
	public Schedule _has;
	public Vector<Grade> _contains = new Vector<Grade>();

	public Course(String courseId, String name, int maxStudents) {
        this._courseId = courseId;
        this._name = name;
        this._maxStudents = maxStudents;
        this._currentStudents = 0;
    }

	public boolean addStudent(Student aStudent) {
		throw new UnsupportedOperationException();
	}

	public boolean removeStudent(Student aStudent) {
		throw new UnsupportedOperationException();
	}

	public int getAvailableSeats() {
		throw new UnsupportedOperationException();
	}

	public boolean isFull() {
		throw new UnsupportedOperationException();
	}
}