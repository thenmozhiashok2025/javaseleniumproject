package javaPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDynamicWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\honey\\Desktop\\selenium course\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers");
		driver.manage().window().maximize();
		List <WebElement> allCompanies = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		System.out.println("Total Companies"+ allCompanies.size());
		
		for (WebElement Company : allCompanies) {
			System.out.println(Company.getText());
		}
		
		List <WebElement> allGroup = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[2]"));
		System.out.println("Total Group"+ allGroup.size());
		
		for (WebElement Group : allGroup) {
			System.out.println(Group.getText());
		}
	}

}

//table[@class='dataTable']/body/tr/td[1]
