
public class User extends Person{
	private boolean isDealer;
	public User(String username, String password, String email) {
		super(username, password, email);
		// TODO Auto-generated constructor stub
	}
	void setToDealer(){
		this.isDealer=true;
	}

}
