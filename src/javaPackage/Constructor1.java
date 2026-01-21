package javaPackage;

public class Constructor1 {
	
	Constructor1(){
		System.out.println("Hello");
	}
	int a;
	Constructor1(int b){
		System.out.println("Hello parameterised");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Constructor1 s1 = new Constructor1();
		Constructor1 s2 = new Constructor1(2);
	}
 
}