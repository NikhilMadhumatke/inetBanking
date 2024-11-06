package com.inetBanking.testCases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.inetBanking.utilities.ReadConfig;
import com.inetBanking.utilities.SwitchingWindows;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_01 {

	public static void main(String[] args) throws InterruptedException {
		
		//ReadConfig readconfig =new ReadConfig();
		
	   // System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+readconfig.getDataFromFile("chromepath"));
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	/*	JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,-1000)"); */
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		SwitchingWindows sw= new SwitchingWindows();
		
		String actData2="OrangeHRM HR Software";
		
		sw.swithToWindow(driver, actData2);
		
		String actData3="OrangeHRM";
		
		sw.swithToWindow(driver, actData3);
		
		
		
		
		
	}
	

}
