package com.java.database.practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleConnection {

	public static void main(String[] args) //throws ClassNotFoundException, SQLException 
	{
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
      try
      {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String s = "jdbc:oracle:thin:@162.70.134.6:1523:FPLSTORMS";
		con = DriverManager.getConnection(s, "pswms", "pswms");
	    stmt = con.createStatement();
		rs = stmt.executeQuery("select * from twmremarktype");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		}
      }
      catch(ClassNotFoundException cne)
      {
    	  
      }
      catch(SQLException se)
      {
    	  
      }
      finally
      {
		try
		{
			rs.close();
			stmt.close();
			con.close();
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
      }
	}

}
