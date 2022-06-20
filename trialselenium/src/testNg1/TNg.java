package testNg1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TNg {
	@BeforeTest
	public void beforetest() {
		System.out.println("before test in class TNg1");
	}
   @Test (groups="sanity")
   public static void Test1() {
	   System.out.println("Test case1 in TNg sanity");
   }
   @Test(groups="functional")
   public static void Test2() {
	   System.out.println("Test case2 in TNg regression");
   }
   @Test(groups="sanity")
   public void Test3() {
	   System.out.println("Test Case3 in TNg sanity");
   }
   @Test(groups="smock")
   public void Test4() {
	   System.out.println("Test Case4 in TNg smock");
   }
}
