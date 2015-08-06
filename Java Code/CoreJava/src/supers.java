/*
 * Super is used to point out the super class instance.
 * 
 * 
 * 
 * 
 */

class employee
{
public void employee()
{
	System.out.println("Syntel Employee");
}
}
class employees extends employee
{
public void employee()
{
	super.employee();
	System.out.println("Infosys Employee");
}
}
public class supers {
	public static void main(String[] args) 
	{
          employee e = new employees();
          e.employee();
	}

}
