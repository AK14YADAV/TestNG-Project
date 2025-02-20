package WebDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTMLTable {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		List<WebElement> tableRow = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		
		System.out.println("Totla number of row: "+ tableRow.size());
		String CompanyName = "Island Trading";

		
		WebElement Contact = driver.findElement(By.xpath("//td[text()='" + CompanyName + "']/following-sibling::td[1]"));
		WebElement Country = driver.findElement(By.xpath("//td[text()='" + CompanyName + "']/following-sibling::td[2]"));
		System.out.println(Contact.getText());
		System.out.println(Country.getText());

		

		// TODO Auto-generated method stub

	}

}
