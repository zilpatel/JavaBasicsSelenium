package demo;

public class Calculator {

	public void add(int a,int b) {
		System.out.println(a+b);
	}
	public void subtract(int a,int b) {
		System.out.println(a-b);
	}
	public void divide(int a,int b) {
		System.out.println(a/b);
	}
	public void multiply(int a,int b) {
		System.out.println(a*b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator baseCal = new Calculator ();
		baseCal.add(10,20);
		baseCal.subtract(20,10);
		baseCal.divide(20,2);
		baseCal.multiply(10,3);
	}

}
