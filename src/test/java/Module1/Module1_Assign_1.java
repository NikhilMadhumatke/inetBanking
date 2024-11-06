package Module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Module1_Assign_1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//driver.get("https://demo.guru99.com/test/login.html");
		driver.get("https://www.amazon.in/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if((driver.getTitle()).contains("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"))
		{
			System.out.println("Title of the Amazon is correct");
		}
		else
			
		{
			System.out.println("Title of the Amazon is incorrect");
		}
		
		driver.navigate().to("https://www.flipkart.com/");
		
		String title1 = driver.getTitle();
		System.out.println(title1);
		
		if((driver.getTitle()).contains("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
		{
			System.out.println("Title of the Amazon is correct");
		}
		else
			
		{
			System.out.println("Title of the Amazon is incorrect");
		}
		
		driver.navigate().back();
		
		driver.close();
	}
}
