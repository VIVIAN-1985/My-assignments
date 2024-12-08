package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class learnframe {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/frame.xhtml");
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//i[@class='pi pi-home layout-menuitem-icon']")).click();
		driver.close();
		
		
		
	}

}
