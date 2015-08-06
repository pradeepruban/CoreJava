import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBInsert 
{
	public static void main(String[] args) throws Exception 
	{
		Connection connection = null; 
		try 
			{ 
			int insertquery;
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			String url="jdbc:odbc:test";
			ResultSet rs=null;
			connection =DriverManager.getConnection(url);
			Statement statement = connection.createStatement(); 
			String query = "insert into employee values(9,'5','50001','Sethu')";
			insertquery = statement.executeUpdate(query);
			connection.close();
			}
		catch (SQLException e) 
    		{ 
            System.out.println("Error in connecting to the database");
    		} 
	}
}
