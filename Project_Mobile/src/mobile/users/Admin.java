package mobile.users;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Admin extends Person {

	public Admin(String username, String password, String email) {
		super(username, password, email);
	}
	
	public void deleteUser(Connection con, String userName) throws SQLException{
		String query = "delete from mydb.user where (username='" + userName + "');";
		
		Statement stmt = con.createStatement();
		int result = stmt.executeUpdate(query);

		System.out.println(result + " rows affected.");
	}
	
	public void deleteAd(Connection con, int ad_id) throws SQLException{
		String query = "delete from mydb.ad where (ad_id=" + ad_id + ");";
		
		Statement stmt = con.createStatement();
		int result = stmt.executeUpdate(query);

		System.out.println(result + " rows affected.");
	}
	
}
