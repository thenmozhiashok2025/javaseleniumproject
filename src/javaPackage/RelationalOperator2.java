package javaPackage;

public class RelationalOperator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "HELLO";
		String  b = "hello";
		
		/*if (a==b) {
			System.out.println("a is eqal to B");
		}
		else {
			System.out.println("a is not eqal to B");
		}*/
	
	//Correct Way to compare 2 strings:
	if (a.equalsIgnoreCase(b))
 {
		System.out.println("a is eqal to B");
	}
	else {
		System.out.println("a is not eqal to B");
	}
	}
}

