import java.util.*;


/* 1) Java ArrayList is a resizable array which implements List 
 * 2) ArrayList is equivalent to Vector, but ArrayList is not synchronized.
 * 3) We can set the initial capacity of the ArrayList using following method.
	ArrayList arrayList = new ArrayList();
	arrayList.ensureCapacity(100);
 * 
 */




public class ArrayList 
 {
   public static void main(String[] args) 
   {
   	  char[] chararray = new char[]{'j','a','v','a'};
	  String str = new String(chararray);
	  System.out.println("Char array converted to String: " + str);
   }
 }

