package javaPackage;

public class Inheritance4 {
	
	int z; //Declaring a global variable
	
	public void addition (int x, int y) {
		
		z = x + y;
		System.out.println("Addition is " + z);
	}
	public void subtraction (int x, int y) {
		
		z = x - y;
		System.out.println("Sub  is " + z);
	}
	public void multiplication (int x, int y) {
		
		z = x * y;
		System.out.println("Mul  is " + z);
	}
	public void division (int x, int y) {
		
		z = x / y;
		System.out.println("Div  is " + z);
	}

}
