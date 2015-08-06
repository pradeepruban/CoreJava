import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 
import java.sql.Statement; 
import java.sql.*;


public class DBConnection 
	{ 
	public static void main(String[] args) throws Exception 
		{ 
        	Connection connection = null; 
        		try 
        			{ 
        			//Class.forName("com.mysql.jdbc.Driver"); 
        			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        			String url="jdbc:odbc:test";
        			ResultSet rs=null;
        			connection =DriverManager.getConnection(url);
        			connection.setAutoCommit(false); 
        			Statement statement = connection.createStatement(); 
        			rs = statement.executeQuery("select * from Employee");
        			while (rs.next()){
        			String name = rs.getString(3);
        			System.out.println("Employee Number :"+name);
        			String id = rs.getString(4);
        			System.out.println("Employee Name :"+id);
        			}
         			connection.close();
        			}
        		catch (SQLException e) 
        		{ 
 	
        			
				} 
		}
		}
