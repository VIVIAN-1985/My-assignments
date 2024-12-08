package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scrolltoelement {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.telerik.com/");
		
		WebElement webElement = driver.findElement(By.xpath("//h2[contains(text(),'Your Success')]"));
		Actions act = new Actions(driver);
		act.scrollToElement(webElement).perform();
		

	}

}
