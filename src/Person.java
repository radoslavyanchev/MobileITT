
public abstract class Person {
	private String username;
	private String password;
	private String email;
	
	public Person(String username, String password, String email) {
		try {
			this.setUsername(username);
			this.setPassword(password);
			this.setEmail(email);
		} 
		catch (NotValidUserNameException e) {
			System.out.println(e.getMessage());
			return;
		}
		catch(WrongPassWordException e1){	
			System.out.println(e1.getMessage());
			return;
		}
		catch(NotValidEmailException e2){
			System.out.println(e2.getMessage());
			return;
		}
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) throws NotValidUserNameException {
		if(username!=null && !username.equals("")){
			this.username=username;
		}else 
			throw new NotValidUserNameException("The username is not valid.");
		
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) throws WrongPassWordException{
		int size=0;
		int aDigit=0;
		int upperCaseLetters=0;
		int lowerCaseLetters=0;
		
		for (int i = 0; i < password.length(); i++) {
			size++;
			if(Character.isDigit(password.charAt(i))){
				aDigit++;
			}
			if(Character.isUpperCase(password.charAt(i))){
				upperCaseLetters++;
			}
			if(Character.isLowerCase(password.charAt(i))){
				lowerCaseLetters++;
			}
		}
		if(size>=8 && aDigit>=1 && lowerCaseLetters>=2 && upperCaseLetters>=1) {
			this.password = password;
		}else{
			throw new WrongPassWordException("Invalid password.");
		}
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) throws NotValidEmailException{
		String localPart=email.substring(0, email.indexOf("@"));
		String monkeyA="@";
		String domainPart=email.substring(email.indexOf("@"), email.length());
		if(!localPart.equals("") && email.contains("@") && (domainPart.contains(".com")|| domainPart.contains(".bg"))){
		this.email = email;
		}
		else{
			throw new NotValidEmailException("Not a valid email address.");
		}
	}
		
}
