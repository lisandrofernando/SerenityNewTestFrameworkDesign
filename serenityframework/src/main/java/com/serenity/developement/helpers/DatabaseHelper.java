package com.serenity.developement.helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseHelper {
    

    String host ="localhost";
	String port ="3306";

    public void  setDatabaseConnexion(String query, String firstValue, String secondValue) throws SQLException{

          Connection con = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/DemoQA","root","Lisandro100@");
		  Statement s =      con.createStatement();
		  ResultSet result =   s.executeQuery(query);
		  while(result.next()) {
		  System.out.println(result.getString(firstValue));
		  System.out.println(result.getString(secondValue));
		  }
		  
		  con.close();

    }

}
