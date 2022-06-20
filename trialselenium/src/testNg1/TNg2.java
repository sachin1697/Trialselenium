package testNg1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TNg2 {
 @BeforeMethod
 public static void beforeTest() {
	 System.out.println("before test in TNg2");
 }
 @AfterMethod
 public static void aftertest() {
	 System.out.println("after test in TNg2");
 }
 @Test
 public static void test1() {
	 System.out.println("testCase 1 in TNg2");
 }
 @Test
 public static void test2() {
	 System.out.println("test case 2 in TNg2");
 }
 @Test
 public static void test3() {
	 System.out.println("test case 3 in TNg2");
 }
 
 
}
