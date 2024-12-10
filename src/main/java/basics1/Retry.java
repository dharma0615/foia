package basics1;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		int retryCount = 0;
		int maxCount = 2;
		if (!(result.isSuccess())) {
			if (retryCount < maxCount) {
				//
				System.out.println("Retrying Test : Re-running " + result.getName() + " for " + (retryCount + 1) + " time(s).");
				retryCount++;
				result.setStatus(ITestResult.FAILURE);
				return true;

			} else {
				result.setStatus(ITestResult.FAILURE);
			}
		} else {
			result.setStatus(ITestResult.SUCCESS);
		}
		return false;
	}

}
