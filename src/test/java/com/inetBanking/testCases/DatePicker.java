package com.inetBanking.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		String year="2023";
		String date= "15";
		
		driver.findElement(By.xpath("//text[text()='Date']")).click();
		
		driver.findElement(By.xpath("//text[text()='"+date+"']"+"//text[text()='"+year+"']")).click();
				//+"/parent::div[@class='sc-kAzzGY llxTcS']/child::text[text()='"+date+"']")).click();
		
		
		

	}

}
