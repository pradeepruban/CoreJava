



public class thiskeyword {

		private int a;
		private String name="";
			public void disp(int a, String name)
				{
					System.out.println("Employee ID :" +a);
					System.out.println("Employee Name :" +name);
				}
	
			public thiskeyword(int a , String name)
				{
					this.a=a;
					this.name = name;
					System.out.println("Employee Id : - "+a);
					System.out.println("Employee Name : -"+name);
				}
	
        	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thiskeyword t = new thiskeyword(5,"pradeep");
		 t.toString();
		t.disp(50,"Ruban");
	   
		

	}

}
