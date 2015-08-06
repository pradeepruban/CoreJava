
import java.util.*;
import java.util.Enumeration;
import java.util.Hashtable;

public class HashMap {
 
  public static void main(String[] args) {

	HashMap hMap = new HashMap();
    hMap.put("One", "Pradeep");
    hMap.put("Two", "Ruban");
    Object obj = hMap.get("One");
    System.out.println(obj);   
   
  }
}
