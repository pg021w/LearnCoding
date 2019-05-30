package com.orangehrm;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Constants.ExcelUtility;
import Constants.Inputs;
import POM.LoginPage;
import POM.RegisterAPatient;
import POM.RegisterAPatientForm;

public class Main {
	public static WebDriver driver;
	
	ExcelUtility excel = new ExcelUtility();
	@BeforeMethod
	public static void Login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome/Application/exte2/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
			driver.get(Inputs.url);
		System.out.print("URL Launched");
	}
	
	@Test
	public static void main() throws IOException
	{ 
	LoginPage.baseclassMethod(driver);
	 RegisterAPatient.registerPatient();
	RegisterAPatientForm.RegisterForm();
	
		}
}
