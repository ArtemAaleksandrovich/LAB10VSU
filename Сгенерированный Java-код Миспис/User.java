public abstract class User {
	private int _id;
	private String _name;
	private String _email;
	private String _password;

	public boolean login() {
		throw new UnsupportedOperationException();
	}

	public void logout() {
		throw new UnsupportedOperationException();
	}
}