package databaseconnection;
import java.sql.*;

public class databasecon
{
	static Connection con;
	public static Connection getconnection()
	{
 		
 			
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");	
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/auction_fraud","root","root");
		}
		catch(Exception e)
		{
			System.out.println("database connection error");
			System.out.println(e);
		}
		return con;
	}
	
}
