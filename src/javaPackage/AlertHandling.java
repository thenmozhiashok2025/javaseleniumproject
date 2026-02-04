package javaPackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\honey\\Desktop\\selenium course\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"confirmButton\"]")).click();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.switchTo().alert().accept();
	//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"confirmButton\"]")).click();
		driver.switchTo().alert().dismiss();
		driver.quit();
		}

}

