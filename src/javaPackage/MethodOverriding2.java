package javaPackage;

public class MethodOverriding2 extends MethodOverriding1{
	
	public void eat() {
		System.out.println("Eating again from overriding2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverriding2 m2 = new MethodOverriding2();
		MethodOverriding1 m1 = new MethodOverriding1();
		
		m2.eat();
		m1.eat();

	}

}
