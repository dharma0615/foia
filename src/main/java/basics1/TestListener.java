package basics1;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName()+"=======Test will start======");
	}

}
