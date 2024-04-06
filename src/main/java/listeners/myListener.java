package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import generics.Basetest;

public class myListener implements ITestListener {


	public void onTestFailure(ITestResult result)
	{
		String scriptname = result.getMethod().getMethodName();
		Basetest.actionUtil.captureScreenShot(scriptname);
	}
}
