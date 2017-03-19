package qrcode;

import java.sql.*;

public class DriveManag {
static Connection con;
static 
{
	try
	{
		Class.forName("com.mysql.jdbc.Driver"); 
    	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/air","root","london");
	System.out.println("driver loaded successfully");
	}
	catch(ClassNotFoundException|SQLException e)
	{
		e.printStackTrace();
	}
	}
}
