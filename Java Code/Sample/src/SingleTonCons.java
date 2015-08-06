public class SingleTonCons
{
	private static SingleTonCons obj;
	private String employee = "Pradeep Ruban";
	private int salary=50000;
	private SingleTonCons()
	{

	}
	public static SingleTonCons getInstance()
	{
		if (obj==null)
		{
			obj = new SingleTonCons();
		}
		return obj;
	}

	public void  getEmployeedetails()
	{
		System.out.println(employee);
		System.out.println(salary);
	}

	public static void main(String arg[])
	{
		SingleTonCons s = SingleTonCons.getInstance();
		s.getEmployeedetails();
	}
	
}