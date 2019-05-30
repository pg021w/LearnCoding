package com.orangehrm;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class URlconnection {
public static void main (String [] args) throws IOException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome/Application/exte2/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
			driver.get("http://www.google.co.in/");	
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		for (int i=0;i<allLinks.size();i++)
		{	WebElement ele = allLinks.get(i);
			String link = ele.getAttribute("href");
		verifylinkActive(link);
				}
				}
public  static void verifylinkActive(String link) throws IOException
{  

		URL url = new URL(link);
		HttpsURLConnection httpurlconnect = (HttpsURLConnection) url.openConnection();
	//httpurlconnect.setConnectTimeout(3000);
	//httpurlconnect.connect();
	if (httpurlconnect.getResponseCode()==200)
	{ 
		System.out.println(link+httpurlconnect.getResponseMessage());
	}
	    if(httpurlconnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
     {
         System.out.println(link+" - "+httpurlconnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
      }
	 
} 
}




