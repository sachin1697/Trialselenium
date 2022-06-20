package excelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTrial {
     public static void insertData(int r,int c, String val) throws IOException {
    	 File file=new File("C:\\eclipse\\trialselenium\\data.xlsx");
    	 FileInputStream input=new FileInputStream(file);
    	 XSSFWorkbook wb=new XSSFWorkbook(input);
    	 XSSFSheet sheet=wb.getSheet("Facebook");
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
    	 
    	 for(int x=0;x<201;x++) {
    		 for(int y=0;y<201;y++) {
    			 if(x*y==0) {
    				 InsertData.m5(x,y,"c.r");
    			 }
    			 else {
    				 break;
    			 }
    			
    		 }
    		
    	 }
     }
}
