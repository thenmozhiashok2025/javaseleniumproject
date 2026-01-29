package javaPackage;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class TestNg5 {
	
	@Test
	public void a() {
		AssertJUnit.assertTrue(2>15);
		System.out.println("Test case a is passed");
			}
	@Test ( dependsOnMethods = "a" )
	public void b() {
			System.out.println("Test case b is passed");
			}

}
