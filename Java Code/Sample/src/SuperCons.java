
class sub
{
	int length,breath,height;
	
	
	sub(int d, int e, int f)
	{
		length=d;
		breath=e;
		height=f;
		
	}
	public int mulvalues()
	{
		return length*breath*height;
	}
}

public class SuperCons extends sub {

	SuperCons()
	{
		super(10,20,30);
	}
	public static void main(String[] args) {
SuperCons s= new SuperCons();
System.out.println("Volume of SpecialCube1 is : "+ s.mulvalues());

	}

}
