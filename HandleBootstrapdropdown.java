package com.orangehrm;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBootstrapdropdown  {

	public static void main (String [] args)
	{ WebDriver driver;
	WebElement element;
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome/Application/exte2/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
			driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.findElement(By.xpath("//button[@class='btn btn-default dropdown-toggle']")).click();
		List<WebElement> dropdown = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
		/*Iterator<WebElement> itr = dropdown.iterator();
		while (itr.hasNext())
		{
			WebElement ele = itr.next();
		String dropdownvalue = ele.getAttribute("innerHTML"); */
		for (WebElement e:dropdown)
		{
		System.out.println(e.getAttribute("innerHTML"));
		}
		
		}
		
	}
	
	

