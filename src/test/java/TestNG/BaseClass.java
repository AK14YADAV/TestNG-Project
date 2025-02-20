package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	@BeforeTest(alwaysRun= true)
	public void beforeTest() {
		System.out.println("Before Test");
	}
	@AfterTest(alwaysRun= true)
	public void afterTest() {
		System.out.println("AFter Test");
	}
	
	@BeforeMethod(alwaysRun= true)
	public void befor() {
		System.out.println("Excuting before every test cases");
	}
	
	@AfterMethod(alwaysRun= true)
	public void after() {
		System.out.println("Executong after every test cases");
	}

}
