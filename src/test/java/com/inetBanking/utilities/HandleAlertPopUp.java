package com.inetBanking.utilities;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

public class HandleAlertPopUp {
	
	WebDriver driver;
	
	public boolean isAlertPresent()
	{
		try
		{
			driver.switchTo().alert();
			return true;
		}
		catch(NoAlertPresentException e)
		{
			return false;
		}
	}

}
