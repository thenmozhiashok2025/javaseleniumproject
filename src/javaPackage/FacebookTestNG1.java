package javaPackage;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class FacebookTestNG1 {
	
	WebDriver driver;
	
	@BeforeTest 
	public void setup() {
		// Launch of google chrome
		System.setProperty("webdriver.chrome.driver","C:\\Users\\honey\\Desktop\\selenium course\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test (priority=1)
	public void createaccount()
	{
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Testhoney");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("account");
	}
	@Test (priority=2)
	public void birthdatepicker()
	{	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("May");
		driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("15");
		driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("1995");
	}
	@Test(priority=3)
	public void genderselect() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name ='sex' and @value='1']")).click();
		Thread.sleep(2000);
	}
	/* @Test
	public void login() 
	{
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("login");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.findElement(By.xpath("//input[@id='reg_pages_msg']")).click();
		System.out.println("Success");
		}*/

	@AfterTest
	public void closedriver() {
 {
			driver.quit();
		}
	}
}