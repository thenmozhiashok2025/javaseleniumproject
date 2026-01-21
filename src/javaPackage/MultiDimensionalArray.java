package javaPackage;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[][] = { {1,2,3},{4,5,6,7},{7,8,9},{11,12,13}};  //in java array need not be perfect square

int row = a.length;
System.out.println("No of rows are "+ row);
int column = a[1].length;
System.out.println("No of columns are "+ column);

System.out.println(a[1][3]);
	}
}
 