package pageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class PageModel {
  @FindBy(xpath="//input[@class='inputtext _55r1 inputtext _1kbt inputtext _1kbt']")
  private WebElement emailID;
  
  @FindBy(xpath="//input[@class='inputtext _55r1 inputtext _9npi inputtext _9npi']")
  private WebElement password;
  
  @FindBy(xpath="//button[@class='_42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy']")
  private WebElement loginButton;
  
  @FindBy(linkText="Forgotten account?")
  private WebElement createPassword;
  
  public PageModel(WebDriver driver) {
	  PageFactory.initElements(driver, this);
  }
  
  public void insertData(String email, String pass) {
	  emailID.sendKeys(email);
	  password.sendKeys(pass);
	  loginButton.click();
  }
  public void forgottePass() {
 	  createPassword.click();
  }
  
}
