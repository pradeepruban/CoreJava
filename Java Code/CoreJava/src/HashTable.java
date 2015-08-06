
import java.util.Hashtable;
 
public class HashTable {
 
  public static void main(String[] args) {
   
    Hashtable ht = new Hashtable();
   
    ht.put("1","One");
    ht.put("2","Two");
    ht.put("3","Three");
    ht.clear();
    System.out.println("Total key value pairs in Hashtable are : " + ht.size());
  }
}

