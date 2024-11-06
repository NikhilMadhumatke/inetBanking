package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropDroppable {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//a[text()='Draggable']")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		WebElement block1 = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement block2 = driver.findElement(By.id("droppable"));
		
	//	Thread.sleep(5000);
		Actions a=new Actions(driver);
		a.dragAndDrop(block1, block2).perform();
		

	}

}
