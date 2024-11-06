package Module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;




public class Assign_1 {
	
	WebDriver driver;
	@BeforeTest
	public void BT()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/login.html");
		
	}
	
	@Test
	public void Login()
	{
		driver.findElement(By.id("email")).sendKeys("likeg34513@raotus.com");
		driver.findElement(By.id("passwd")).sendKeys("abcd");
		
		driver.findElement(By.id("SubmitLogin")).click();
	}
	
	@AfterTest
	public void AT()
	{
		driver.close();
	}

}
