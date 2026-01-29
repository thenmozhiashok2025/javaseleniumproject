package javaPackage;

import org.testng.annotations.*;

public class TestNG3 {
	
	@Test
	public void b() {
	System.out.println("b method");
	}
	@Test 
	public void a() {
	System.out.println("a method");
	
 }
	@Test (priority = 1)
	public void c() {
	System.out.println("c Method");
	
 }
	@Test
	public void e() {
	System.out.println("e Method");
	
 }
	@Test
	public void d() {
	System.out.println("d Method");
	
 }
 }
