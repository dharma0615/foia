package basics1;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestNGClass2 {

	@AfterTest
	public void method() {
		System.out.println("After Test annoation block executes after all testcase");
	}
	
	@BeforeMethod
	public void method3() {
		System.out.println("Before Method annotation block will run before each method");
	}
	
	@BeforeClass
	public void method4() {
		System.out.println("Before Class annotation block will run");
	}
	
	@Test(priority=1,retryAnalyzer = Retry.class)
	public void method1() {
		System.out.println("method1 executed");
		Assert.assertEquals(false, true);
	}
	

	@Test(priority=0, enabled=false, groups= {"smoke"})
	public void method2() {
		System.out.println("method2 executed");
	}
	


}
