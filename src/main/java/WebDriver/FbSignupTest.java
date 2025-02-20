package WebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbSignupTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement SignUp = driver.findElement(By.partialLinkText("Create new"));
		SignUp.click();

		// DOB Dropdown
		WebElement day = driver.findElement(By.id("day"));
		Select ddDay = new Select(day);
		ddDay.selectByVisibleText("1");

		WebElement month = driver.findElement(By.id("month"));
		Select ddMonth = new Select(month);
		ddMonth.selectByVisibleText("Jan");

		WebElement year = driver.findElement(By.id("year"));
		Select ddyear = new Select(year);
		ddyear.selectByVisibleText("1990");

		// Gender radio button
		WebElement gender = driver.findElement(By.xpath("//label[text()='Male']"));
		gender.click();

	}
}
