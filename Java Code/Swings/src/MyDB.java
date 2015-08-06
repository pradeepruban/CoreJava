
	import java.sql.*;

	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;
import java.util.*;
import java.sql.*;

	public class MyDB
	{
		
		private JTable table;
		
		
		      	Connection con = null;
		      	static String uname ;
				static String password;
				Statement statement;
				ResultSet rs=null;
			public static void main(String arg[]) throws SQLException, ClassNotFoundException
			{
			
			
				Connection con = null;
				Statement ps;
				uname ="Syntel";
				password = "Chennai";
				String uname=null;
				String query=null;
					try 
						{



						    String url="jdbc:odbc:sat";
						    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

						//	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
							con =DriverManager.getConnection(url);
							System.out.println("Connected to the DB");
							/*query = "select * from test";
							ps = con.prepareStatement(query); 
							ResultSet rs = ps.executeQuery(); 
							while (rs.next())
							{
							uname = rs.getString("uname");
							System.out.println("User Name"+uname);
							}*/
							uname = "pradeep";
							query = "insert into test (id,uname)"+" values(1,'pradeep')";
							ps = con.prepareStatement(query);
							ps.execute(query); 

							
							
						}
						catch(SQLException sqls) 
						{
							System.err.println("Failed to load JDBC/ODBC driver.");
						}

			}		
					
			}
