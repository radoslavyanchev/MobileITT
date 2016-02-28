package mobile.main;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

import mobile.ad.Ad;
import mobile.car.Engine;
import mobile.car.Gearbox;
import mobile.car.Vehicle;
import mobile.users.Admin;
import mobile.users.Person;
import mobile.users.User;

public class Demo {
	public static void main(String[] args) throws Exception {
	
			
			Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");

			Gearbox.getAllGearboxesFromDB(myConnection);
			Gearbox.getMapValues();
			
			System.out.println();
			Engine.getAllEnginesFromDB(myConnection);
			Engine.getMapValues();
			
			Admin admin = new Admin("admin", "Aasasdfasdf8", "email@abv.bg");
			admin.deleteUser(myConnection, "user1");
			
			
	}

}
