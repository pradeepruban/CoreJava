
class Cons1 {

	int length;
	int breadth;
	int height;
	public int getVolume() {
		return (length * breadth * height);
	}
	Cons1(int l, int b, int h) {
		length = l;
		breadth = b;
		height = h;
		System.out.println("Finished with Parameterized Constructor having 3 params of Cube");
	}
}

public class Cons extends Cons1 {

	int weight;
	Cons() {
		super(10, 20, 30); //Will Give a Compilation Error without this line
		weight = 10;
	}
	public static void main(String[] args) {
		Cons specialObj1 = new Cons();
		System.out.println("Volume of SpecialCube1 is : "+ specialObj1.getVolume());
	}
}
