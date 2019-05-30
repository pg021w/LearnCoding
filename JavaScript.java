package com.orangehrm;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
public static void main (String [] args)
{
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome/Application/exte2/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
			driver.get("https://learn.letskodeit.com/p/practice");	
			((JavascriptExecutor)driver).executeScript("document.getElementById('opentab').click();");

}
}
