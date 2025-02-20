package TestNG;


import org.testng.annotations.Test;

public class TestCases2 extends BaseClass {
	
	
	@Test(enabled =true, groups= {"regression"})
	public void tc1() {
		System.out.println("Test Case 1");
	}

	@Test(enabled = true, priority=2, groups= {"regression"})
	public void tc2() {
		System.out.println("Test Case 2");
	}

	@Test(groups= {"regression"})
	public void tc3() {
		System.out.println("Test Case 3");
	}

	@Test(groups= {"regression"})
	public void tc4() {
		System.out.println("Test Case 4");
	}

	@Test(groups= {"regression"})
	public void tc5() {
		System.out.println("Test Case 5");
	}
	

}
