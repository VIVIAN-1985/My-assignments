package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class createlead {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("(//input[@value='Login'])")).click();
		
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vivian");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Vincent");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("XYZ");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Welcome");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		

		
	
				
		
	}

}
