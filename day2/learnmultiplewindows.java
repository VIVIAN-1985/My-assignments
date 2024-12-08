package week4.day2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class learnmultiplewindows {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.irctc.co.in/");
		
		driver.findElement(By.linkText("FLIGHTS")).click();
		Set <String> pw =driver.getWindowHandles();
		System.out.println(pw);
		
		String Title = driver.getTitle();	
		System.out.println("Parent Window : +title");
		
		
		
		
		
		
	}

}
