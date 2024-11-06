package com.inetBanking.utilities;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class SwitchingWindows {
	
	public void swithToWindow(WebDriver driver , String partialWindowTitle) {
	       Set<String> set = driver.getWindowHandles();
	         Iterator<String> it = set.iterator();

	          while (it.hasNext()) {
			          String wID = it.next();
			          driver.switchTo().window(wID);
			          String currentWindowTitle = driver.getTitle();
			          if(currentWindowTitle.contains(partialWindowTitle)) {
			        	  break;
			          }
		    	}
	}

}
