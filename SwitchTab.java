package com.orangehrm;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SwitchTab {
	public static void main (String [] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome/Application/exte2/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
			driver.get("https://learn.letskodeit.com/p/practice");
			WebElement tab = driver.findElement(By.cssSelector("a#opentab"));
			tab.click();
			List<String> tabs = new ArrayList (driver.getWindowHandles());
	       if(tabs.size()>1)
	       {
	       driver.switchTo().window(tabs.get(1)); 
	       }
	       else
	    	   Assert.fail("Only one tab");
	       String getTitle = driver.getCurrentUrl();
	       Assert.assertEquals(getTitle, "https://letskodeit.teachable.com/courses","Title not matching");
	        

	}

}
