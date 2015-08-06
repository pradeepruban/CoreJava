import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;

public class JTrees
{


public JTrees()
{
JFrame frame = new JFrame("JTree Demo");
Container c = frame.getContentPane();
c.setLayout( new BorderLayout() ); 

//Create top node of a tree
final DefaultMutableTreeNode top = new DefaultMutableTreeNode("Course");

//Create a subtree UG
final DefaultMutableTreeNode UG = new DefaultMutableTreeNode("UG");
top.add(UG);
final DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("B.E");
UG.add(a1);
final DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("B.C.A");
UG.add(a2);
final DefaultMutableTreeNode a3 = new DefaultMutableTreeNode("B.Sc");
UG.add(a3);
final DefaultMutableTreeNode a4 = new DefaultMutableTreeNode("B.Com");
UG.add(a4);
final DefaultMutableTreeNode a5 = new DefaultMutableTreeNode("B.A");
UG.add(a5);



//Create a subtree PG
final DefaultMutableTreeNode PG = new DefaultMutableTreeNode("PG");
top.add(PG);
final DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("M.E");
PG.add(b1);
final DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("M.C.A");
PG.add(b2);
final DefaultMutableTreeNode b3 = new DefaultMutableTreeNode("M.Sc");
PG.add(b3);
final DefaultMutableTreeNode b4 = new DefaultMutableTreeNode("M.Com");
PG.add(b4);
final DefaultMutableTreeNode b5 = new DefaultMutableTreeNode("M.A");
PG.add(b5);

//Creating tree
final JTree tree = new JTree(top);


int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
final JScrollPane jsp = new JScrollPane(tree,v,h);
c.add(jsp,BorderLayout.CENTER ); 

final JTextField text = new JTextField("",20);
c.add(text,BorderLayout.SOUTH);

tree.addMouseListener( new MouseAdapter()
{
public void mouseClicked( MouseEvent me)
{
TreePath tp = tree.getPathForLocation(me.getX(),me.getY() );
if( tp != null )
text.setText(tp.toString() );
else
text.setText("");
}
}
); 
if(top.children()==b1)
{
	System.out.println("M.E Cource Selected");
}
frame.setSize(300,200);
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String [] arg)
{
JTrees obj = new JTrees(); 
}
} 