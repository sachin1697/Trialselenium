package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class S1 {
   public static void select() throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\automisation lecture\\selenium\\chromeDriver\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.navigate().to("https://demoqa.com/select-menu");
	  //driver.navigate().refresh();
	  WebElement sec=driver.findElement(By.cssSelector("select#oldSelectMenu"));
	  //sec.click();
	  Thread.sleep(3000);
	  Select obj1=new Select(sec);
	  //obj1.selectByIndex(1);
	    
	  //Thread.sleep(10000);
	  List<WebElement> drop=obj1.getOptions();
	  for(WebElement s:drop) {
		 String val=s.getText();
		 if(val.equalsIgnoreCase("White")){
			 s.click();
		 }
		 
	  }
	  Thread.sleep(6000);
	  driver.close();

   }
   public static void main(String[]args) throws InterruptedException {
	   S1.select();
   }
}
