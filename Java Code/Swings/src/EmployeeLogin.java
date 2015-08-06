import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class EmployeeLogin extends JFrame implements ActionListener
{
	private JButton btnok,btnexit,btnaddnew; //buttons
	private JTextField tf1,tf2;//textfields
	private JLabel lblname,lbladd,lblmsg; //labels
    private JPanel p1,p2,p3,psouth; //panels
    Statement st = null;
    Connection con = null;
    ResultSet rs = null;
    public EmployeeLogin()
    {
    	  btnok = new JButton("OK");
    	    btnok.addActionListener(this);
    	    btnexit = new JButton("Exit");
    	    btnexit.addActionListener(this);
    	    btnaddnew = new JButton("AddNew");
    	    btnaddnew.addActionListener(this);

    	    //initializing textfields
    	    tf1 = new JTextField(12);
    	    tf2 = new JTextField(12);
    	    //initializing labels

    	    lblname = new JLabel("Name:");
    	    lbladd = new JLabel("Address:");
    	    lblmsg = new JLabel("",JLabel.CENTER);

    	    //initializing panels
    	    p1 = new JPanel();
    	    p2 = new JPanel();
    	    p3 = new JPanel();
    	    psouth = new JPanel();

    	    //adding buttons and label to panel p1
    	    //setting flowlayout
    	    p1.setLayout(new FlowLayout());

    	    p1.add(btnok);
    	    p1.add(btnexit);
    	    p1.add(btnaddnew);
    	    //adding lblmsg to panel p3
    	    p3.add(lblmsg);

    	    //adding both the panels to new panel,psouth
    	    //settin layout 2:1
    	    psouth.setLayout(new GridLayout(2,1));
    	    psouth.add(p3);
    	    psouth.add(p1);


    	    //adding label and textfields to panel p2
    	    p2.setLayout(new GridLayout(3,1));
    	    //setting line and titled border for panel p2
    	    p2.setBorder(BorderFactory.createLineBorder(Color.red));
    	    p2.setBorder(BorderFactory.createTitledBorder("Enter Your Details"));
    	    p2.add(lblname);
    	    p2.add(tf1);
    	    p2.add(lbladd);
    	    p2.add(tf2);

    	    //adding panel to container
    	    this.getContentPane().add(p2,"Center");
    	    this.getContentPane().add(psouth,"South");

    	    this.setSize(300,300);
    	    this.setLocation(100,200);
    	    this.show();

    }
    public static void main(String args[])
    {
       EmployeeLogin ad = new EmployeeLogin();
     }
    public void actionPerformed(ActionEvent ae)
    {
     
    	
    	if(ae.getSource()==btnok)
    	{
    		try {
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				String url = "jdbc:odbc:pradeep";
				 con = DriverManager.getConnection(url); 
				 System.out.println("Connected to the database");
				 String uname = 
			} catch (ClassNotFoundException e) {
				System.out.println("Not connected to database");
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("Not connected to database");
				e.printStackTrace();
			}
    	}
    	    	}
}
