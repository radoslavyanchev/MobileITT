package mobile.users;

public class User extends Person {

	private boolean isDealer;

	public User(String username, String password, String email) {
		super(username, password, email);
		// TODO Auto-generated constructor stub
	}

	public void setToDealer() {
		this.isDealer = true;
	}

}
