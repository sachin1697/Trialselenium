package testNg2;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ImplementingClass extends Listeners1 implements ITestListener {
	
	ScreenShotClass ref;

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("On test Start");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("On test Success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("On test Failure");
		
		//String name=result.getName();
		
		 ref=new ScreenShotClass();
		 
		 try {
			ref.captureScreen(driver,result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("On test Skipped");
	}

}
