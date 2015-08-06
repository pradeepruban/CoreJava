class user
{
	public void display()
	{
		System.out.println("Pradeep Ruban from syntel");
	}
}

class employee extends user
{
	public void display()
	{
		super.display();
		System.out.println("JAPA Resource");
	}
}
public class SuperEmployee {
	public static void main(String arg[])
	{
	user u = new employee();
	u.display();
	}

}
