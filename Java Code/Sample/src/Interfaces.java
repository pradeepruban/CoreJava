/**
 * 
 * 1) An interface can contain any number of methods
 * 2)You cannot instantiate an interface
 * 3)An interface does not contain any constructors.
 * 4) An interface cannot contain instance fields. The only fields that can appear in an interface must be declared both static and final.
 * 5)An interface is not extended by a class; it is implemented by a class
 */
import java.util.*;
interface country
{
	public void lists();
	public void names();
}

interface company
{
	public void companylist();
	public void countrylist();
}
public class Interfaces implements country,company
{

	public void lists()
	{
		List a = new ArrayList();
		a.add("India");
		a.add("Austrlia");		
		System.out.println("List of country participated in olympics\n"+a);
		String value = String.valueOf(a);
        String[] temp;
		String delimiter = ",";
		temp = value.split(delimiter);
		for(int i =0; i < temp.length ; i++)
		System.out.println("\n"+temp[i]);
		System.out.println("Value of a:"+a);
	}
	public void names()
	{
		System.out.println("Name of the country participated ");
	}
	public void companylist()
	{
		List a = new ArrayList();
		a.add("Infosys");
		a.add("Syntel");		
		System.out.println("List of company participated in olympics\n"+a);
	}
	public void countrylist()
	{
		List a = new ArrayList();
		a.add("India");
		a.add("Austrlia");		
		System.out.println("List of country participated in olympics\n"+a);
	}
	
	public static void main(String arg[])
	{
		Interfaces i = new Interfaces();
		i.lists();
		i.names();
		i.companylist();
		i.countrylist();
	}
}
