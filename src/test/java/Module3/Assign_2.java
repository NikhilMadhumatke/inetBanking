package Module3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign_2 {
	
	WebDriver driver;
	
	
	@BeforeTest
	public void BT()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/login.html");
		
	}
	
	@Test
	public void Login() throws IOException
	{
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("./Configuration/config.properties");
		p.load(fis);
		driver.findElement(By.id("email")).sendKeys(p.getProperty("username1"));
		driver.findElement(By.id("passwd")).sendKeys(p.getProperty("password1"));
		
		driver.findElement(By.id("SubmitLogin")).click();
	}
	
	@AfterTest
	public void AT()
	{
		driver.close();
	}


}
