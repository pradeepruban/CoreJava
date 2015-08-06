import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
public class SwingMenu extends JFrame{
public SwingMenu(){
JMenuBar menubar=new JMenuBar();

ImageIcon openicon=new ImageIcon("open.png");
   
JMenu file=new JMenu("File");
file.setMnemonic(KeyEvent.VK_F);

JMenuItem open=new JMenuItem("open",openicon);
open.setMnemonic(KeyEvent.VK_O);

JMenuItem close=new JMenuItem("Close");
close.setMnemonic(KeyEvent.VK_C);

JMenu edit=new JMenu("Edit");
edit.setMnemonic(KeyEvent.VK_E); 

//adding menu item to menu
file.add(open);
file.add(close);

//addin menus to menubar
menubar.add(file);
menubar.add(edit);

setVisible(true);
setSize(205,250);
setJMenuBar(menubar);
setDefaultCloseOperation(EXIT_ON_CLOSE);

}





public static void main(String kl[]){
SwingUtilities.invokeLater(new Runnable(){
SwingMenu a = new SwingMenu();

public void run(){
new SwingMenu();

}
});
}
}
