package com.orangehrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CaptureTooltip {
public static void main (String [] args)
{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome/Application/exte2/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
			driver.get("http://demo.guru99.com/test/tooltip.html");
			WebElement element=driver.findElement(By.xpath("//a[@id='download_now']"));
			Actions action = new Actions(driver);
			action.clickAndHold().moveToElement(element).build().perform();
			WebElement eletoolkit = driver.findElement(By.xpath("//div[@class='tooltip']/a"));
			String tool = eletoolkit.getText();
			//String message = driver.findElement(By.xpath("//a[@id='download_now']")).getText();
			System.out.println(tool);
}
}
