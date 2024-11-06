package Module2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Module2_Assign_1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//Handling WebTable
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		
		List<WebElement> options = driver.findElements(By.xpath("//table[@class='dataTable']//a"));
		System.out.println(options.size());
		
		for(WebElement alloptions:options) {
			System.out.println(alloptions.getText());
		}
		
		
		//Login
		driver.navigate().to("https://demo.guru99.com/test/login.html");
		
		driver.findElement(By.id("email")).sendKeys("likeg34513@raotus.com");
		driver.findElement(By.id("passwd")).sendKeys("abcd");
		
		driver.findElement(By.id("SubmitLogin")).click();
		
		System.out.println("=================================================");
		
		System.out.println("Successfully Login");
		
		driver.close();
		
		
		
		

	}

}
