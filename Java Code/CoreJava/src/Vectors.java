
import java.util.Vector;

/*
public class Vectors {
   public static void main(String[] args) {
  
	   //Vector<Integer> vec = new Vector<Integer>(4);
	   Vector<String> vec = new Vector<String>(4);
      vec.add("Pradeep");
      vec.add("Ruban");
      vec.add("Syntel");
      vec.add("Chennai");
      System.out.println("Added numbers in vec vector are :- "); 
      for (String pradeep : vec) {
         System.out.println("Name = " + pradeep);
      }
      

   }    
}
*/

import java.util.ListIterator;
import java.util.Vector;


public class Vectors {

    /**
     * Java Vector example
     * Adding/removing objects to the Vector and basic Vector methods 
     */
    public static void main(String[] args) {
        Vector<String> list = new Vector<String>(); 
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
        list.add("Fifth");
        System.out.println("List elements:");
        for(String s : list){
            System.out.println("-" + s);
        }
        //first element has index 0, second 1, ...
        System.out.println("Second element is:" + list.get(1));
        System.out.println("Index of object 'Second':" 
                                + list.indexOf("Second"));//1
        System.out.println("List size:" + list.size());
        System.out.println("Sublist from 3rd(inclusive) to 5th(exclusive) element:" 
                + list.subList(2, 4));
        System.out.println("Removing second element...");
        list.remove(1);
        System.out.println("List size:" + list.size());
        System.out.println("List elements:");
        //iterating by iterator
        ListIterator<String> i = list.listIterator(); 
        while (i.hasNext()) {
            String s = i.next();
            System.out.println("-" + s);
        }
        System.out.println("List contains object 'First'? " 
                + list.contains("First"));
        
        
    }
}