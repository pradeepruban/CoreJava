import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;
/*
 * Menu thinks to notify
 * 1) JMenuBar
 * 2) JMenu
 * 3) JMenuItem
 */
public class Menus
	{
      private Object fileItem2;  
      /*public Menus()
      {
      			 JFrame frame = new JFrame("Directory Page");
    	  //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      JMenuBar menubar = new JMenuBar();
    	  JMenu file = new JMenu("File");
    	  file.add(new JSeparator());
    	  JMenu edit = new JMenu("Edit");
    	  edit.add(new JSeparator());
    	  JMenuItem fileItem1 = new JMenuItem("New");
    	  JMenuItem fileItem2 = new JMenuItem("Open");
    	  System.out.println("fileItem2"+fileItem2);
    	  JMenuItem fileItem3 = new JMenuItem("Close");
    	  fileItem3.add(new JSeparator());
    	  JMenuItem fileItem4 = new JMenuItem("Save");
    	  JMenuItem editItem1 = new JMenuItem("Cut");
    	  JMenuItem editItem2 = new JMenuItem("Copy");
    	  editItem2.add(new JSeparator());
    	  JMenuItem editItem3 = new JMenuItem("Paste");
    	  JMenuItem editItem4 = new JMenuItem("Insert");
    	  file.add(fileItem1);
    	  file.add(fileItem2);
    	  file.add(fileItem3);
    	  file.add(fileItem4);
    	  edit.add(editItem1);
    	  edit.add(editItem2);
    	  edit.add(editItem3);
    	  edit.add(editItem4);
    	  menubar.add(file);
    	  System.out.println("File Menu Bar"+menubar.add(file));
    	  menubar.add(edit);
    	  frame.setJMenuBar(menubar);
    	  frame.setSize(400,400);
    	  frame.setVisible(true);   
    	  
      }   */  
      		public static void main(String[] args)
      		{
      			Menus s = new Menus();
      			SwingUtilities.invokeLater(new Runnable() 
      				{   
      					public void run() 
      					{   
      						new FileDialog();   
      					}   
      				}
      				);   
      		}   
	} 