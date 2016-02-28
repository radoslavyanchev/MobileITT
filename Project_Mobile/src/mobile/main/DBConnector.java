package mobile.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnector {

	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	public DBConnector(){
		
	}
	
	public void dbConnect(String query) throws SQLException{
		
		Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
		
		PreparedStatement statement = myConnection.prepareStatement(query);
	
//		ResultSet rs = statement.executeUpdate(query);
	}

}
