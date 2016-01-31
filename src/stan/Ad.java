package mobileITT.stan;

import java.util.List;
import java.util.Set;

public abstract class Ad {

	private static final int VALIDITY_TYPE_NUM = 2;
	
	private int[] validity;
	private Car car;
	private String phone;
	private String email;
	private String textDescription;
	
	private Set<Person> followers;
	
	Ad(){
		// match array index with expiration days 
		validity = new int[VALIDITY_TYPE_NUM];
	}
	
	public void addFollower(Person follower){
		if(follower != null){
			this.followers.add(follower);
		}
	}
	
	public void removeFollower(Person follower){
		if(this.followers.isEmpty()){
			return;
		}
		if(follower != null){
			this.followers.remove(follower);
		}
	}
	
}
