package excelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteText {
	public static void m5(int r, int c, String val) throws IOException {
		File file=new File(System.getProperty("user.dir")+"//data.xlsx");
		
		FileInputStream getinput=new FileInputStream(file);
		
		XSSFWorkbook wb=new XSSFWorkbook(getinput);
		
		XSSFSheet sheet=wb.getSheetAt(1);
		//XSSFRow row=sheet.getRow(r);
		//XSSFCell cell=row.createCell(c);
		//cell.setCellValue(val);
		sheet.getRow(r).createCell(c).setCellValue(val);
		
		FileOutputStream insert=new FileOutputStream(file);
		wb.write(insert);
		
        wb.close();		
		
		
	}
	
	
	
 public static void main(String[]args) throws IOException {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\automisation lecture\\selenium\\chromeDriver\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://jqueryui.com/datepicker/");
	 
	 WebElement frame=driver.findElement(By.tagName("iframe"));
	 driver.switchTo().frame(frame);
	 
	 //step 2nd 
	 driver.findElement(By.xpath("//input[@class='hasDatepicker']")).click();
	 String date="May 2021";
	 
	boolean s=true;
	 int x=1;
	 
	 
	 while(s) {
		 driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		 String actualdate=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		
		 if(date.equalsIgnoreCase(actualdate)) {
			 s=false;
		 }
		 else {
			 
		 }
		 m5(200,x,actualdate);
		 x++; 
	 }
 }
} 
