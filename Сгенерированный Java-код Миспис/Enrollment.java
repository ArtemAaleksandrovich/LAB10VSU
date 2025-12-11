
import java.util.Date;

public class Enrollment {
	private String _enrollmentId;
	private Date _enrollmentDate;
	private EnrollmentStatus _status;
	private EnrollmentStatus _attribute;
	public Grade _recorded_in;
	public Student _has;
	public Course _for_4;

	public void approve() {
		throw new UnsupportedOperationException();
	}

	public void reject() {
		throw new UnsupportedOperationException();
	}

	public void cancel() {
		throw new UnsupportedOperationException();
	}
}