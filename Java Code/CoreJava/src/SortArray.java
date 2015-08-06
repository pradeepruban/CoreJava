
import java.util.Arrays;
 
public class SortArray {
        
        public static void main(String args[]){
 
        	String[] strNames = new String[]{"John", "alex", "Chris", "williams", "Mark", "Bob"};
                
                /*
                 * To sort String array in java, use Arrays.sort method.
                 * Sort method is a static method.               *
                 */
                
                //sort String array using sort method
        	// Can use any of the methods.
                //Arrays.sort(strNames);        
              
        	     Arrays.sort(strNames, String.CASE_INSENSITIVE_ORDER);
                 System.out.println("String array sorted (case sensitive)");                
                
                for(int i=0; i < strNames.length; i++){
                        System.out.println(strNames[i]);
                }
                
        }
}
