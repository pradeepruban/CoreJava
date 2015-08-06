import java.io.*;
import java.util.*;
public class StringTokenizes{
  String str;
  int count = 0;
  public static void main(String[] args) 
  {
	  StringTokenizes c = new StringTokenizes();
  }
  public StringTokenizes()
  {
    try
    {
      InputStreamReader ir = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(ir);
      System.out.print("Enter String: ");
      str = br.readLine();
      System.out.println("Enter String is : "+ str);
      System.out.println("Breaking this string is : ");
      StringTokenizer token = new StringTokenizer(str);
      while (token.hasMoreTokens())
      {
        count++;
        str = token.nextToken();
        System.out.println(str);
      }
      System.out.println("Number of Words : "+ count);
    }
    catch(IOException e)
    {
    	
    }
  }
}
