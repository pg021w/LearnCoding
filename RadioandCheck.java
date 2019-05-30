package com.orangehrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioandCheck {
	@Test
public static void main ()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome/Application/exte2/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/radio.html");	
		WebElement radiobox1 = driver.findElement(By.xpath("//*[@id='vfb-7-1']"));
		boolean statusOfradiobox1 = radiobox1.isSelected();
		if (statusOfradiobox1==false)
		{
			radiobox1.click();
			
		}
		Assert.assertEquals(radiobox1.isSelected(), true,"Assert Pass");
}
}
