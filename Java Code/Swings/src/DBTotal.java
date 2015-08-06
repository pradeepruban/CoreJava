import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.*;

public class DBTotal {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		Connection connection = null; 
		try 
			{ 
			int deletequery,updatequery,insertquery;
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			String url="jdbc:odbc:test";
			ResultSet rs=null;
			connection =DriverManager.getConnection(url);
			Statement statement = connection.createStatement();
			System.out.println("Please Input A Number");
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String data = br.readLine();
	        int datas =Integer.parseInt(data);
	        System.out.println("Enter Option : "+datas);

			if(datas==1)
			{
				String query = "delete from employee where Empname='Hrithikesh' and ID=8";
				deletequery = statement.executeUpdate(query);
				System.out.println("Data deleted from the database");
				connection.close();
			}
			else if(datas==2)
			{
				String query = "update employee set Empname='Salamon' where Empname='Hrithikesh' and ID=8";
				updatequery = statement.executeUpdate(query);
				System.out.println("Updated the data in the database");
				connection.close();
			}
			else if (datas==3)
			{
				String query = "insert into employee values(8,'2','50001','Hrithikesh')";
				insertquery = statement.executeUpdate(query);
				System.out.println("Data Inserted into the database");
				connection.close();
			}
		
			}
		catch (SQLException e) 
    		{ 
            System.out.println("Error in connecting to the database");
    		} 
	}

}
