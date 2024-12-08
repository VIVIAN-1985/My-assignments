package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class swagbuggsloginpage {

	public static void main(String[] args) {
	//swagbuggs
		
		ChromeDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://www.swagbucks.com/p/login");
		
		driver.findElement(By.id("sbxJxRegEmail")).sendKeys("vivianvince@gmail.com");
		driver.findElement(By.id("sbxJxRegPswd")).sendKeys("Vivian@123");
		driver.findElement(By.id("loginBtn")).click();
		
		
		
		
		
		
		

	}

}
