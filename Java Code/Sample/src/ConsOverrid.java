
class overrid
{
	int c=0;
	void add(int a , int b)
	{
	
		c=a+b;
	}
	void disp()
	{
		System.out.println("Overrid value 1st constructor:-"+c);
	}
}

class overrid1 extends overrid 
{
	int c=0;
	void add(int a, int b)
	{
		c=a+b;
	}
	void disp()
	{
		System.out.println("Overrid value 2nd constructor:-"+c);
	}
}
public class ConsOverrid {
	
public static void main(String[] args) 
{
overrid1 s = new overrid1();
overrid l = new overrid();
s.add(20,30);
l.add(100, 20);
s.disp();
l.disp();
}

}
