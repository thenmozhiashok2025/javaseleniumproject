package javaPackage;

public class MethodOverLoading1 {
	
	int sum;

	public  void sum (int a, int b){
		
	sum = a + b ;
	System.out.println("sum" + sum);
		
	}
	public  void sum (int a, int b,int c){
	
	sum = a + b + c ;
	System.out.println("sum" + sum);
	}

}
