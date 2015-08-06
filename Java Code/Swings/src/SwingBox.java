import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

class SwingBox1 extends JFrame implements ActionListener
{
  JFrame frame;
  JButton login,exit;
  JButton quit = new JButton("Quit");
  JLabel l1,l2;
  JTextField t1, t2;
  JPanel panel;
  public JOptionPane OptionPane;
  public SwingBox1()
  {
	  l1 = new JLabel();
	  l1.setText("Username:");
	  t1 = new JTextField(30);
	  l2 = new JLabel();
	  l2.setText("Password");
      t2 = new JPasswordField(15);
	  login = new JButton("Login");
	  exit = new JButton("Exit");
	  panel=new JPanel(new GridLayout(3,1));
      panel.add(l1);
      panel.add(t1);
      panel.add(l2);
      panel.add(t2);
      panel.add(login);
      panel.add(quit); 
      frame = new JFrame("Login");
      frame = new JFrame("Quit");
      quit.setBounds(50, 60, 80, 30);
      quit.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent event) {
        	  JOptionPane optionPane = new JOptionPane("Exit the Page", JOptionPane.QUESTION_MESSAGE, JOptionPane.YES_NO_OPTION);
              JDialog dialog = optionPane.createDialog(null, "Manual Creation");
              dialog.setVisible(true);
              System.exit(0);
         }
      });
  //login.addActionListener(new MyAction());
  add(panel,BorderLayout.CENTER);
  login.addActionListener(new MyAction());
  setTitle("LOGIN FORM");
  }
  class NextPage extends JFrame
  {
    NextPage()
   {
   setTitle("Loggin by SAT");
   setSize(400, 200);
    }
   } 
  public class MyAction implements ActionListener
  {
	  
  public void actionPerformed(ActionEvent ae)
  {
  String value1=(String)t1.getText();
  String value2=(String)t2.getText();
  System.out.println("Value of T1:"+t1);
  System.out.println("Value of T2:"+t2);
  if (value1.equals("sat") && value2.equals("sat")) {
  NextPage page=new NextPage();
  page.setVisible(true);
  JLabel label = new JLabel("Welcome:"+value1);
  page.getContentPane().add(label);
  }
  else{
  System.out.println("enter the valid username and password");
  OptionPane.showMessageDialog(frame,"Unable to Login");
  }
}
}  
 /* public class MyAction implements ActionListener{
  public void actionPerformed(ActionEvent e){
  JOptionPane.showMessageDialog(frame,"Loggined Sucessfully");
  }
  }*/
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}
}
  public class SwingBox
  {
	 
  public static void main(String[] args)
  {
	 
	  try
	  {
      SwingBox1 db = new SwingBox1();
	  db.setSize(300,300);
	  db.setVisible(true);
	  }
	  catch(Exception e)
	  {
		  JOptionPane.showMessageDialog(null, e.getMessage());
	  }
  }
  }
 

 