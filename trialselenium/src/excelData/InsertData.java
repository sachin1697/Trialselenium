package excelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public  class InsertData {
	public static void m5(int r, int c, String val) throws IOException {
		File file=new File(System.getProperty("user.dir")+"//data.xlsx");
		
		FileInputStream getinput=new FileInputStream(file);
		
		XSSFWorkbook wb=new XSSFWorkbook(getinput);
		
		XSSFSheet sheet=wb.getSheet("Facebook");
		//XSSFRow row=sheet.getRow(r);
		//XSSFCell cell=row.createCell(c);
		//cell.setCellValue(val);
		try {
		sheet.getRow(r).createCell(c).setCellValue(val);
		}
		catch(NullPointerException e) {
			sheet.createRow(r).createCell(c).setCellValue(val);
		}
		finally {
		FileOutputStream insert=new FileOutputStream(file);
		wb.write(insert);
		
        wb.close();		
		}
		
	}
	
	
	
 public static void main(String[]args) throws IOException {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\automisation lecture\\selenium\\chromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
	 for(int x=1;x<4;x++) {
		List<WebElement>ta=driver.findElements(By.xpath("//table[@id='product']//tbody//tr//td["+x+"]"));
	      int y=2;
	      for(WebElement ele:ta) {
	    	  String data=ele.getText();
	    	  m5(y,x,data);
	    	  y++;
	      }
	 }
	 
	 
}
}
