package com.orangehrm;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchWindow {

	public static void main(String [] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome/Application/exte2/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
			driver.get("https://learn.letskodeit.com/p/practice");	
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("button#openwindow"))));
			WebElement openWindow = driver.findElement(By.cssSelector("button#openwindow"));
			openWindow.click();
			String parentWindow = driver.getWindowHandle();
			System.out.println(parentWindow);
			Set <String> windowNames = driver.getWindowHandles();
			Iterator<String> itr = windowNames.iterator();
			while (itr.hasNext())
			{
				String child = itr.next();
				System.out.println(child);
			}
			driver.switchTo().window(parentWindow);
			String current=driver.getWindowHandle();
			System.out.println(current);
			
			
	}
	
}
