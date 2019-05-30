package Constants;

import java.io.File;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public  class ExcelUtility {
	
	public static File src;
	public static FileInputStream fis;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	
	

public static  void ExcelMapping() throws IOException
{
	 src= new File(Inputs.Excelpath);
	 fis= new FileInputStream(src);
	 wb= new XSSFWorkbook(fis);
	 sheet = wb.getSheet("Sheet1");
	 
}
public static String username () throws IOException

{System.out.print("Where is the sheet");
ExcelMapping();
String username= sheet.getRow(1).getCell(0).getStringCellValue();
System.out.println(username);
return(username);
}
public static String FamilyName () throws IOException
{ExcelMapping();
String FamilyName= sheet.getRow(1).getCell(1).getStringCellValue();
return(FamilyName);
}
public static String sex () throws IOException
{ExcelMapping();
String sex= sheet.getRow(1).getCell(2).getStringCellValue();
return(sex);
}

	}

