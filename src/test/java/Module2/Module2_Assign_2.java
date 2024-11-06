package Module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Module2_Assign_2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.name("cusid")).sendKeys("123456");
		
		driver.findElement(By.name("submit")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		
		
		

	}

}
