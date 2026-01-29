//Order of execution of test methods in TestNG by default is alphabetical order of method names.
//if the name is a1,a2	... then it will be executed in that order.

package javaPackage;
import org.testng.annotations.*;

public class TestNG2 {
	@Test
	public void login() {
		System.out.println("This is TestNG2 class Login method");
	}
	@Test
	public void dashboard() {
		System.out.println("This is TestNG2 class Dashboard method");
	}

	@Test
	public void facebook()	{
		System.out.println("This is TestNG2 class Facebook method");
	}
	@Test
	public void amazon()	{
		System.out.println("This is TestNG2 class Amazon method");
	}	
}
