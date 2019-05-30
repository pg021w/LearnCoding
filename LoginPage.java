package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public  class LoginPage {
	public static WebDriver driver;
	
public static void baseclassMethod (WebDriver driver)
{
System.out.println("Reached to Login Page");
LoginPage.driver=driver;
WebElement username = driver.findElement(By.id("username"));
	System.out.println("Identified username");
	WebElement pass = driver.findElement(By.id("password"));
	username.sendKeys("Admin");
	pass.sendKeys("Admin123");
	WebElement ward = driver.findElement(By.xpath("//li[text()='Inpatient Ward']"));
	ward.click();
	WebElement login = driver.findElement(By.cssSelector("input.confirm"));
	login.click();
}
}
