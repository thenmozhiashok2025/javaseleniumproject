package javaPackage;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[] = {1,2,3,4,5,6};
String s[] = {"Selenium","Java", "Automation"};
Object o[] = {8,9,0,'c','d',"then", 5 >10};

//find the lenght of all arrays:
System.out.println(a.length);
System.out.println(s.length);
System.out.println(o.length);

System.out.println(s[1]);
s[1]="Change";
System.out.println(s[1]);
	}

}
