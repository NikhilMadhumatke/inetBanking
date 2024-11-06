package Module2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Module2_Assign_2_2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator it = handles.iterator();
		
		String parentId= (String) it.next();
		String childId= (String) it.next();
		
		driver.switchTo().window(childId);
		
		driver.findElement(By.name("emailid")).sendKeys("wixam29508@aaorsi.com");
		
		driver.findElement(By.name("btnLogin")).click();
		
		
		
		
		

	}

}
