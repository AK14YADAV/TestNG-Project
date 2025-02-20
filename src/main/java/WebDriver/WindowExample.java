package WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class WindowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement clickme1 = driver.findElement(By.xpath("//button[@id='alertButton']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", clickme1);

		clickme1.click();
		
		Alert alert1 = driver.switchTo().alert();
		System.out.println("Alert1 message is: " +  alert1.getText());
		alert1.accept();
		
		WebElement clickMe4 = driver.findElement(By.id("promtButton"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", clickMe4);
		clickMe4.click();
		Alert alert4 = driver.switchTo().alert();
		System.out.println("Alert4 message is: " +  alert4.getText());
		alert4.sendKeys("HelloWorld");
		alert4.accept();

		;
	}
	

}
