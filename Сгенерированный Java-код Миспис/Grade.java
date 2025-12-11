
import java.util.Date;

public class Grade {
	private String _gradeId;
	private double _value;
	private Date _dateAssigned;
	public Course _contains;
	public Enrollment _recorded_in;

	public double calculateGPA() {
		throw new UnsupportedOperationException();
	}
}