import java.util.*;

//Java ArrayList Sum All Elements
public class Genericss {
 
  public static void main(String args[])
  {
 	  //create new ArrayList
      ArrayList<String> a = new ArrayList<String>();
      a.add("1");
      a.add("2");
      a.add("3");
       //Java ArrayList Sum All Elements
      int sum = 0;
      for(int i=0; i < a.size(); i++){
          sum = sum + Integer.parseInt(a.get(i));
   
      }
    
      System.out.println("Sum of all elements of ArrayList is " + sum);
   
  }
}
