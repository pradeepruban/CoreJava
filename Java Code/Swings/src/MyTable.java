import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class MyTable extends JFrame {
private Connection connection;
private JTable table;
public MyTable()
{
String url="jdbc:odbc:bk";
String username ="kt";
String password="kt";
try 
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
connection=DriverManager.getConnection(url,username,password);
}
catch(ClassNotFoundException cnfex) 
{
System.err.println("Failed to load JDBC/ODBC driver.");
cnfex.printStackTrace();
System.exit(1);
}
catch( SQLException sqlex ) 
{
System.err.println("Unable to connect");
sqlex.printStackTrace();
}
getTable();
setSize(450,150);
show();
}
private void getTable()
{
Statement statement;
ResultSet resultSet;
try {
String query = "SELECT * FROM BOOKS";
statement = connection.createStatement();
resultSet=statement.executeQuery(query);
displayResultSet(resultSet);
statement.close();
}
catch ( SQLException sqlex) {
sqlex.printStackTrace();
}
}

private void displayResultSet(ResultSet rs) throws SQLException
{
boolean moreRecords=rs.next();
if (!moreRecords) {
JOptionPane.showMessageDialog(this,"ResultSet contained no records");
setTitle("No records to display");
return;
}
setTitle("Authors table from Books");
Vector columnHeads=new Vector();
Vector rows=new Vector();
try
{
ResultSetMetaData rsmd=rs.getMetaData();
for ( int i=1; i <10;i++)
columnHeads.addElement(rsmd.getColumnName(i));
do
{
rows.addElement(getNextRow(rs,rsmd));
}
while (rs.next());


table=new JTable(rows,columnHeads);


JScrollPane scroller=new JScrollPane(table);


getContentPane().add(scroller,BorderLayout.CENTER);


validate();


}


catch(SQLException sqlex) {


sqlex.printStackTrace();


}


}


private Vector getNextRow(ResultSet rs,ResultSetMetaData rsmd) throws SQLException


{


Vector currentRow= new Vector();


for (int i=1; i <10;i++)

switch(rsmd.getColumnType(i)) {


case Types.VARCHAR:


currentRow.addElement(rs.getString(i));


break;


case Types.DECIMAL:


currentRow.addElement(new Long(rs.getLong(i)));


break;


default:


System.out.println("Type was: "+rsmd.getColumnTypeName(i));


}


return currentRow;


}


public void shutDown()


{


try{


connection.close();


}


catch(SQLException sqlex) {


System.err.println("Unable to disconnect");


sqlex.printStackTrace();


}


}


public static void main(String args[])


{


final MyTable app=new MyTable();


app.addWindowListener(


new WindowAdapter() {


public void windowClosing(WindowEvent e)


{


app.shutDown();


System.exit(0);


}


}


);


}


}

