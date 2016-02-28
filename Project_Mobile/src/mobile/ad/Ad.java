package mobile.ad;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;
import mobile.car.Vehicle;
import mobile.exceptions.InvalidParameterException;
import mobile.users.Person;

public class Ad {

	private static final int SHORT_VALIDITY = 35;
	private static final int LONG_VALIDITY = 49;

	private int id;
	private int adValidity;
	private LocalDate startDate;
	private Vehicle car;
	private String phone;
	private String email;
	private String textDescription;
	private int price;
	private City city;

	private Set<Person> followers;

	public Ad(int adValidity, Vehicle car, String textDescription, int price) throws InvalidParameterException {
		super();
		this.followers = new LinkedHashSet<Person>();
		this.startDate = LocalDate.now();
		this.adValidity = adValidity;
		this.car = car;
		this.phone = car.getOwner().getPhoneNum();
		this.email = car.getOwner().getEmail();
		this.textDescription = textDescription;
		setPrice(price);
	}

	
//	private String createQuery(int id, int adValidity, Vehicle car, String phone, String email, String carDescription, int price, City city){
//		
//	}
	
	public boolean addToDB(String query){
		
		return false;
	}
	
	
	
	public void addFollower(Person follower) throws InvalidParameterException {
		if (follower != null) {
			this.followers.add(follower);
		} else {
			throw new InvalidParameterException();
		}
	}

	public void removeFollower(Person follower) {
		if (this.followers.isEmpty()) {
			return;
		}
		if (follower != null) {
			this.followers.remove(follower);
		}
	}
	
	public void setPrice(int price) throws InvalidParameterException {
		if (price > 0) {
			this.price = price;
		} else {
			throw new InvalidParameterException();
		}
	}
	
	public void setCity(City city) throws InvalidParameterException {
		if (city != null) {
			this.city = city;
		} else {
			throw new InvalidParameterException();
		}
	}

	public void setAdValidity(int adValidity) throws InvalidParameterException {
		if(adValidity == SHORT_VALIDITY || adValidity ==  LONG_VALIDITY){
			this.adValidity = adValidity;			
		}
		else  {
			throw new InvalidParameterException();
		}
	}

	public int getPrice() {
		return price;
	}

	public int getAdValidity() {
		return adValidity;
	}

	public int getId() {
		return id;
	}
	
	

}
