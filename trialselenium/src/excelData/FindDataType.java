package excelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FindDataType {
   public static void m1(int r, int c) throws IOException {
	   File file=new File(System.getProperty("user.dir")+"//data.xlsx");
	   
	   FileInputStream getInput=new FileInputStream(file);
	   
	   XSSFWorkbook wbook=new XSSFWorkbook(getInput);
	   XSSFSheet sheet=wbook.getSheetAt(0);
	   XSSFRow row=sheet.getRow(r);
	   XSSFCell cell=row.getCell(c);
	   CellType dataType=cell.getCellType();
	   
	   System.out.println(dataType);
	 switch(dataType) {
	 case STRING:System.out.println(cell.getStringCellValue());
		         break;
	 case NUMERIC:System.out.println(cell.getNumericCellValue());
	             break;
   }
   }
   public static void main(String[]args) throws IOException {
	   m1(1,1);
	   m1(2,1);
   }
}
