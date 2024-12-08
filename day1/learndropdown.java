package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class learndropdown {

	public static void main(String[] args) {
		
		
		// learn drop down by selenium
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml");
		WebElement dd = driver.findElement(By.className("ui-selectonemenu"));
		Select obj =new Select (dd);
		//obj.selectByIndex(4);
		obj.selectByVisibleText("Selenium");
		}

}
