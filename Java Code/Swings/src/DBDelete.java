import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBDelete {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		Connection connection = null; 
		try 
			{ 
			int deletequery;
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			String url="jdbc:odbc:test";
			ResultSet rs=null;
			connection =DriverManager.getConnection(url);
			Statement statement = connection.createStatement(); 
			String query = "delete from employee where Empname='Ruban' and ID=9";
			deletequery = statement.executeUpdate(query);
			System.out.println("Data deleted from the database");
			connection.close();
			}
		catch (SQLException e) 
    		{ 
            System.out.println("Error in connecting to the database");
    		} 
 
		

	}

}
