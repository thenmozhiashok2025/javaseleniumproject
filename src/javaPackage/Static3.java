package javaPackage;

public class Static3 {
	
	int roll;
	String name;
	static String college = "IIT Delhi";
	
	Static3(int r , String n){
		
		roll = r;
		name = n;
		
	}
public void getResult() {
	System.out.println(roll + " " + name + " " + college);
}
	public static void main(String[] args) {

 Static3 s3 = new Static3(1,"john");
 Static3 s4 = new Static3(2,"Alex");
 Static3 s5 = new Static3(3,"Nihal");
 
s3.getResult();
s4.getResult();
s5.getResult();
	}

}
