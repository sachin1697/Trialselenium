package excelData;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HightOfTab {
 @BeforeSuite
 public static void m1() {
	 System.out.println("this is before suite mathod");
 }
 @BeforeTest
 public static void beforetest() {
	 System.out.println("this is before test method");
 }
 @BeforeClass
 public static void beforeclass() {
	 System.out.println("this is before class method");
 }
 @BeforeMethod
 public static void beforemethod() {
	 System.out.println("this is before method ");
 }
 @Test
 public static void Testcase1() {
	 System.out.println("thsi is test case 1");
 }
}
