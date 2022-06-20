package pageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OPageModel {
  @FindBy(id="txtUsername")
  private WebElement userid;
  
  @FindBy(id="txtPassword")
  private WebElement password;
  
  @FindBy(xpath="//input[@id='btnLogin']")
  private WebElement button;
  
  public OPageModel(WebDriver driver) {
	  PageFactory.initElements(driver, this);
  }
  public void insertdata(String id, String Pass) {
	  
	  userid.sendKeys(id);
	  password.sendKeys(Pass);
	  
	  Assert.assertTrue(password.isEnabled());
  }
  public void loginbutton() {
	  button.click();
  }
  
  
}
