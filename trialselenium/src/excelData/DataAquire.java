package excelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataAquire {
    public static String m1(int r, int c) throws IOException {
    	File file=new File("C:\\eclipse\\trialselenium\\data.xlsx");
    	
    	FileInputStream inputfrom=new FileInputStream(file);
    	
    	XSSFWorkbook getdata=new XSSFWorkbook(inputfrom);
    	
    	XSSFSheet sheet=getdata.getSheet("Sheet2");
    	
    	String data=sheet.getRow(r).getCell(c).getStringCellValue();
    	
    	getdata.close();
    	return data;
    }
    public static void main(String[]args) throws IOException {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\automisation lecture\\selenium\\chromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(m1(1,1));
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(m1(1,2));
		
		
    }
}
