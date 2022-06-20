package pageModel;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OTestModel extends OBaseClass{
 // WebDriver driver;
  OPageModel lp;
  @BeforeClass
  public void obj() {
	  lp=new OPageModel(driver);
  }
  @Test(priority=1)
  public void login() {
	  lp.insertdata("Admin","admin123 ");
  }
  @Test(priority=2)
  public void clickon() {
	 lp.loginbutton();
  }
}
