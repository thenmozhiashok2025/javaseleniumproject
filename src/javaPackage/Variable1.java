package javaPackage;

public class Variable1 {

	public static void main(String[] args) {
		
      int a = 5;  // Local variable
      System.out.println(a);
      amethod();
      bmethod();
	}
int d = 30; // Global Variable

public static void amethod() {
	
  int b = 20;  // Local variable
  System.out.println(b);
}

public static void bmethod() {
	
	  int c = 100;  // Local variable
	  int e[]= {1,2,3,4,5,6};
	  System.out.println(c);
	  //System.out.println(e);
	}
}
