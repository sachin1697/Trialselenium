package testNg2;


import org.testng.Assert;

public class TC4 {
	
  public void sendKeys() {
	  System.out.println("this is TC3 and sendKeys method");
	  String email="sacin@123";
	  String mail="sachin@234";
	  Assert.assertEquals(email,mail);
  }
}
