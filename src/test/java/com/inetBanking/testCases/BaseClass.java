package com.inetBanking.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetBanking.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	ReadConfig readconfig =new ReadConfig();
	
	
	
    public String baseURL= readconfig.getDataFromFile("URL");
	public String username= readconfig.getDataFromFile("username");
	public String password= readconfig.getDataFromFile("password");
	public static WebDriver driver;
	public static WebDriver sDriver;
	
	@Parameters("BROWSER")
	@BeforeClass
	public void setup(String Browser)
	{
		/*System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+readconfig.getDataFromFile("chromepath"));
		driver=new ChromeDriver(); */
		//String Browser= readconfig.getDataFromFile("browser"); 

		if(Browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			System.out.println("Chrome browser launched successfully");
		}
		else if(Browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			System.out.println("Firefox browser launched successfully");
		}
		else if(Browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
			System.out.println("Edge browser launched successfully");
		}
		else
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			System.out.println(" By Default Chrome browser launched successfully");			
		}
		
	    sDriver = driver;
		
	  //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
		
		System.out.println("Launching the Browser");
		
		
	}
		
		
	/*	public boolean isAlertPresent()
		{
			try
			{
				driver.switchTo().alert();
				return true;
			}
			catch(NoAlertPresentException e)
			{
				return false;
			}
		} */


	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	
	

}
