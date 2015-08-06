
public class finals {

public final void add()
{
	System.out.println("Add method is clicked");
}
	
public void adds()
{
	System.out.println("Add method is declared as final it cannot be overriden");
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		finals f = new finals();
		f.add();
		f.adds();

	}

}
