package POM;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Constants.ExcelUtility;

public class RegisterAPatientForm extends LoginPage {
public static void RegisterForm()  throws IOException
{
WebElement PatientsFNAme = driver.findElement(By.xpath("//input[contains(@class,'autocomplete-input')][@name='givenName']"));
	
	System.out.println("PatientsFNAme done");
	PatientsFNAme.sendKeys(ExcelUtility.username());
	WebElement PatientsLNAme = driver.findElement(By.xpath("//input[contains(@class,'autocomplete-input')][@name='familyName']"));
	PatientsLNAme.sendKeys(ExcelUtility.FamilyName());	
	WebElement Gender = driver.findElement(By.xpath("//span[text()='Gender']"));
	Gender.click();
	Select GenderDrp = new Select (driver.findElement(By.xpath("//select[@id='gender-field']")));
	GenderDrp.selectByVisibleText(ExcelUtility.sex());
	WebElement Bday = driver.findElement(By.cssSelector("span#birthdateLabel"));
	Bday.click();
	WebElement Birthdate = driver.findElement(By.cssSelector("input#birthdateDay-field"));
	Birthdate.sendKeys("20");
	Select BirthMon = new Select (driver.findElement(By.cssSelector("select#birthdateMonth-field")));
	System.out.println(BirthMon);
	Birthdate.click();
	BirthMon.selectByVisibleText("March");
	
	
	
	
	
}
}
