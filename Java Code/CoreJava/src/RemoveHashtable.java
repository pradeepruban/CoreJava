import java.util.Enumeration;
import java.util.Hashtable;
 
public class RemoveHashtable 
{
 /* public static void main(String[] args) 
  {
	  Hashtable ht = new Hashtable();
     //add key value pairs to Hashtable
    ht.put("1","One");
    ht.put("2","Two");
    ht.put("3","Three"); 
    Object obj = ht.remove("2");
    System.out.println(obj + " Removed from Hashtable");
    //print remaining Hashtable values
    Enumeration e = ht.elements();
    //iterate through Hashtable values Enumeration
    while(e.hasMoreElements())
      System.out.println(e.nextElement());
  }
}
*/

public static void main(String args[])
{
Hashtable ht = new Hashtable();
ht.put("1", "Pradeep");
ht.put("2","Ruban");
ht.put("3", "Chennai");
Object obj= ht.remove("2");
System.out.println("Removed from Hashtable :"+obj);

Enumeration e = ht.elements();

while(e.hasMoreElements())
{
	System.out.println(e.nextElement());
}
	
	
}
}