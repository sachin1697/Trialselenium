package testNg1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TNg1 {
	@BeforeSuite
	public void beforetest() {
		System.out.println("before test in class TNg");
	}
		 
		 @Test (groups="functional")
		 public static void Testcase1() {
			 System.out.println("this is test case 1 functional");
		 }
		 @Test (groups="functional")
		 public static void Testcase2() {
			 System.out.println("this is test case 2 functional");
		 }
		 @Test (groups="functional")
		 public static void Testcase3() {
			 System.out.println("this is test case 3 functional");
		 }
		 @Test (groups="functional")
		 public static void Testcase4() {
			 System.out.println("this is test case 4 functional");
		 }
		 @Test (groups="functional")
		 public static void Testcase5() {
			 System.out.println("this is test case 5 functional");
		 }
		@AfterSuite
		public void m1() {
			System.out.println("After suite in TNg1");
		}
}
