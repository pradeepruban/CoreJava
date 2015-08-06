// Method overriding. 

class A
{
	int i,j;
	A( int a, int b)
	{
		i=a;
		j=b;
	}
	void disp()
	{
		System.out.println("Value of i: "+i);
		System.out.println("Value of j: "+j);
	}
}

class B extends A
{
	int k;
	B(int a,int b,int c)
	{
	super(a,b);
	
	k = c;
	}
	void show()
	{
		System.out.println("K Value : - "+k);
	}
}
public class Supers
{
	public static void main(String args[])
	{
	B bs = new B(10,20,30);
	A as = bs;
	bs.show();
	as.disp();
	
	}
}