package excelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataIn {
      public static void m1(int r, int c, String addString) throws IOException {
    	  File file=new File(System.getProperty("user.dir")+"\\data.xlsx");
    	  
    	  FileInputStream getFile=new FileInputStream(file);
    	  
    	  XSSFWorkbook wb=new XSSFWorkbook(getFile);
    	  
    	  XSSFSheet sheet=wb.getSheetAt(0);
    	  
    	  XSSFRow row=sheet.createRow(r);
    	  XSSFCell cell=row.createCell(c);
    	  
    	  cell.setCellValue(addString);
    	  
    	  FileOutputStream wrt=new FileOutputStream(file);
    	  wb.write(wrt);
    	  
    	  wb.close();
      }
      
      public static void main(String[]args) throws IOException {
    	  m1(2,1,"sachin");
      }
}
