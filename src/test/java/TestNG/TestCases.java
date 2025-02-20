package TestNG;


import org.testng.annotations.Test;

public class TestCases extends BaseClass {
	
	
	@Test(enabled =true, groups= {"sanity","regression"})
	public void tc1() {
		System.out.println("Test Case 1");
	}

	@Test(enabled = true, priority=4)
	public void tc2() {
		System.out.println("Test Case 2");
	}

	@Test
	public void tc3() {
		System.out.println("Test Case 3");
	}

	@Test
	public void tc4() {
		System.out.println("Test Case 4");
	}

	@Test
	public void tc5() {
		System.out.println("Test Case 5");
	}

}
