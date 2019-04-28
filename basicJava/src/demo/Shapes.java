package demo;

public class Shapes {

	int length;
	int breath;

	public Shapes() {
		length = 4;
		breath = 3;
}
	
public Shapes(int a, int b) {
	length = a;
	breath = b;
}
	
public void area() {
	System.out.println("Area of Rectangle = " + (length * breath) +" sq.cm");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Shapes rectangle = new Shapes();
	//	rectangle.area();
		Shapes rectangle = new Shapes(10,4);
		rectangle.area();
		
	}

}
