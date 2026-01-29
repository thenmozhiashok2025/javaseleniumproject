package javaPackage;

import org.testng.annotations.Test;

public class TestNG4 {
		
		@Test
		public void a() {
		System.out.println("a method");
		}
		
		@Test  (enabled = false)
		public void b() {
		System.out.println("b method");
		
	 }
		@Test (priority = 1)
		public void c() {
		System.out.println("c Method");
		
	 }
		@Test  (invocationCount = 3) 
		public void d(){
		System.out.println("d Method");
		
	 }
		@Test
		public void e() {
		System.out.println("e Method");
		
	 }

}
