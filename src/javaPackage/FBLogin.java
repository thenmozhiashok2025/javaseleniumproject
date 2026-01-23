package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLogin {

	public static void main(String[] args) {
		// Launch of google chrome
System.setProperty("webdriver.chrome.driver", "C:\\Users\\honey\\Desktop\\selenium course\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\honey\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.get("https://www.facebook.com");

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("abc@gmail.com");
driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("login");
driver.findElement(By.xpath("//button[@name='login']")).click();
driver.findElement(By.xpath("//input[@id='reg_pages_msg']")).click();
System.out.println("Success");
	}

}
