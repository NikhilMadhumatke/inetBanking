package Module1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Module1_Assign_2 {

	public static void main(String[] args) {
		
		
		/*String Key="webdriver.chrome.driver";
		String value="D:\\Users\\Nikhil Madhumatke\\eclipse-workspace\\inetBankingV1\\Drivers\\chromedriver_win32 (1).zip";
		System.setProperty(Key, value);*/
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.findElement(By.id("vfb-7-1")).click();
		
		driver.findElement(By.id("vfb-6-1")).click();
		
		driver.findElement(By.id("vfb-6-2")).click();
		
		driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
		
		WebElement dropdown = driver.findElement(By.name("country"));
		
		Select s=new Select(dropdown);
		
    	
    	s.selectByVisibleText("KUWAIT");
    	
    	driver.close();
	}

}
