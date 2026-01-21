package javaPackage;

public class NestedIf1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 20;
		int weight = 55;

		if (age > 18) {
			if (weight > 50) {
				System.out.println("Eligible");
			} else {
				System.out.println("Not Eligible");
			}
		} else {
			System.out.println("Not Eligible");
		}
	}

}
