import java.awt.Container;
import java.awt.Frame;

import javax.swing.*;


class frames extends JFrame implements ActionListener
{
	 JButton Login;
	 JPanel panel;
	 JLabel label1,label2;
	 JTextField  text1,text2;
	 Frame[] c = JFrame.getFrames();
	 
	 frames()
	 {
		 label1 = new JLabel();
		 label1.setText("User Name");
		 text1 = new JTextField(15);
		 
		 label2 = new JLabel();
		 label2.setText("Password");
		 text2 = new JTextField(15);
		 c.setBackground(Color.RED); 
	 }
}
public class Login {

}
