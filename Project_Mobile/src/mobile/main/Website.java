package mobile.main;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import mobile.ad.Ad;
import mobile.ad.City;
import mobile.car.Engine;
import mobile.users.Admin;
import mobile.users.Person;

public class Website {
	// map<user_id, ad_id>
	private Map<Integer, Integer> ads;
	
	
	public Website() {
		
		ads = new HashMap<Integer, Integer>();
	}

	
	public  void getAllAdsFromDB(Connection connection) throws SQLException{
		String query= "select * from mydb.ad";
		PreparedStatement statement = connection.prepareStatement(query);
		ResultSet result= statement.executeQuery();
		while(result.next()){
			Integer key= result.getInt("user_id");
			Integer value= result.getInt("ad_id");
			
			ads.put(key, value);
		}
		
	}
	public void getMapValues(){
		for (Entry<Integer, Integer> entry : ads.entrySet()) {
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
	}

	
	void searchAd() {

	}

	public void add(Object o, List<Object> list) {
		
	}

	public void remove(Object o, List<Object> list) {
		if(o != null && list != null && list.size() > 0){
			
			if(o instanceof Ad){
				this.ads.remove((Ad) o);
			}
		}
	}
}
