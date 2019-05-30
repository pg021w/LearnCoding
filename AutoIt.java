package com.orangehrm;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIt {
public static void main (String [] args) throws IOException
{ 
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome/Application/exte2/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
			driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");	
			driver.findElement(By.xpath("//input[@name='upfile']")).click();
			Runtime.getRuntime().exec("C:\\Users\\PRACHIGU\\Desktop\\SDET\\AutoIT\\Upload.exe");
			
			
}
}
