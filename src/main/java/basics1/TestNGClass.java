package basics1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(basics1.TestListener.class)
public class TestNGClass extends TestListener {

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

	@Test(priority = 1, groups = { "smoke" })
	public void method1() {
		System.out.println("method1 executed from 1st class");
	}

	@Test(enabled = true)
	public void method11() throws InterruptedException {
		System.out.println("method11 executed=====   " + TestNGClass.class.getName() + new Object() {
		}.getClass().getEnclosingMethod().getName());

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		Assert.assertEquals(title, "Google");
		System.out.println(title);
		driver.close();
	}

	@Test(priority = 0, enabled = true, groups = { "smoke" }, timeOut = 10000, invocationCount = 5, threadPoolSize = 3)
	public void method2() {
		System.out.println("method2 executed");
	}

}
