package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterAPatient extends LoginPage {
	
public static void registerPatient()
{
	WebElement RegisterAPatient = driver.findElement(By.xpath("//a[@class='button app big'][contains(@href,'registerPatient')]"));
RegisterAPatient.click();
	}
}
