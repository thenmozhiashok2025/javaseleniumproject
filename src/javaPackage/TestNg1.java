package javaPackage;
import org.testng.annotations.*;

public class TestNg1 {
	
	
	@BeforeSuite
	public void b() {
	System.out.println("b method before suite");
	}
	@BeforeTest
	public void a() {
	System.out.println("a method before test");
	
 }
	@Test
	public void c() {
	System.out.println("C Method");
	
 }
	@AfterTest
	public void e() {
	System.out.println("e Method after test case");
	
 }
	@Test
	public void d() {
	System.out.println("d Method");
	
 }
 }
