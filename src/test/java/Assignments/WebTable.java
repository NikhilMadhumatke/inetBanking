package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		
		List<WebElement> options = driver.findElements(By.xpath("//table[@class='dataTable']//a"));
		System.out.println(options.size());
		
		for(WebElement alloptions:options) {
			System.out.println(alloptions.getText());
		}

		driver.close();
	

	}

}
