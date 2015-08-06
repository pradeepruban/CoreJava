

class OverloadDemo 
{ 
	
	void empname()
	{
		System.out.println("Employee Name::-");
	}
	void empid(int id)
	{
	System.out.println("Employee Id:-"+id);	
	}
}	
	class cons2
	{
		public static void main(String arg[])
		{
			OverloadDemo s = new OverloadDemo();
			s.empname();
			s.empid(28001);
			
		}
	}
 
