package week2.day1;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class facebookcreate {

	

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("vivian");
		driver.findElement(By.name("lastname")).sendKeys("vincent");
		driver.findElement(By.name("reg_email__")).sendKeys("9994884491");
		driver.findElement(By.id("password_step_input")).sendKeys("Password");
		
		WebElement dd = driver.findElement(By.id("day"));
		WebElement mon = driver.findElement(By.id("month"));
		WebElement yr = driver.findElement(By.id("year"));
		
		new Select (dd).selectByVisibleText("23");
		new Select (mon).selectByVisibleText("Sep");
		new Select (yr).selectByVisibleText("1985");
		driver.findElement(By.xpath("(//input[@class='_8esa'])[2]")).click();
	
		
		
	}

}
