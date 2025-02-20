package WebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoradExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement searchbar = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		searchbar.sendKeys("Simpliearn");
	//	searchbar.sendKeys(Keys.ENTER);
		
		searchbar.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		searchbar.sendKeys("Udemy");
		searchbar.sendKeys(Keys.ENTER);
//		WebElement PopUp = driver.findElement(By.xpath("//div[text()='Reject all']"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", PopUp );
//		PopUp.click();

		driver.quit();
	}

}
