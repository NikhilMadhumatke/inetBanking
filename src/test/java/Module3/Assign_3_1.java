package Module3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign_3_1 {
	
	WebDriver driver;
	@Test(groups={"smoke"})
	public void LaunchBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		driver.findElement(By.xpath("//h5[text()='Forms']")).click();
		driver.findElement(By.xpath("//span[text()='Practice Form']")).click();
		//driver.findElement(By.id("firstName")).sendKeys("Vihaan");
	}
	
	@Test(dependsOnMethods="LaunchBrowser",groups={"regression"})
	public void Form()
	{
		driver.findElement(By.id("firstName")).sendKeys("Vihaan");
		driver.findElement(By.id("lastName")).sendKeys("kapoor");
		driver.findElement(By.id("userEmail")).sendKeys("likeg34513@raotus.com");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.id("userNumber")).sendKeys("9578945612");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		driver.findElement(By.id("dateOfBirthInput")).click();
		WebElement dropdown1 = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		
		Select s=new Select(dropdown1);
		
		s.selectByVisibleText("August");
		
		WebElement dropdown2 = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		
		Select s1=new Select(dropdown2);
		
		s1.selectByVisibleText("1999");
		
		driver.findElement(By.xpath("(//div[text()='5'])[1]")).click();
		
	/*	WebElement subject = driver.findElement(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']"));
		subject.sendKeys("Science");   */
		
		driver.findElement(By.xpath("//label[text()='Sports']")).click();
		
		driver.findElement(By.id("currentAddress")).sendKeys("FC road, Pune");
		
		WebElement dropdown3 = driver.findElement(By.name("//div[text()='Select State']"));
		
		Select s2=new Select(dropdown3);
		
    	
    	s.selectByVisibleText("NCR");
    	
    	
    	WebElement dropdown4 = driver.findElement(By.name("//div[text()='Select City']"));
		
		Select s4=new Select(dropdown4);
		
    	
    	s4.selectByVisibleText("Delhi");
    	
    	driver.findElement(By.id("submit")).click();
    	
    	
    	
		
		//driver.findElement(By.xpath("//label[text()='Sports']")).click();
	/*	JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");*/
	}

}
