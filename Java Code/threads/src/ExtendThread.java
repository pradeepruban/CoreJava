import java.util.ArrayList;


class ExtendThreads extends Thread
{
	public void run()
	{
		ArrayList a = new ArrayList();
		a.add("pradeep");
		a.add("ruban");
		
		System.out.println("a"+a);
		Thread thread = new ExtendThreads();
		thread.start();
		
	}
}
	public class ExtendThread extends ExtendThreads
	{
			

	public static void main(String[] args) {
		ExtendThreads s = new ExtendThreads();

        s.start();
 	}
	}

