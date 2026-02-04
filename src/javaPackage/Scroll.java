package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\honey\\Desktop\\selenium course\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		
		//Syntax to scroll down
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//using Pixel:
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-200)");
		Thread.sleep(2000);
		
		WebElement x = driver.findElement(By.xpath("//*[@id=\"messageWindowButton\"]")); 
		js.executeScript("arguments[0].scrollIntoView()",x);
		
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");	
		driver.close();
		System.out.println("Success");
		}

}
