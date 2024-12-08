package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class learnbrowser {

			public static void main(String[] args) throws InterruptedException {
			
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();	
				driver.get("https://netbanking.hdfcbank.com/netbanking/");
				Thread.sleep(2000);
				driver.close();		


	}

}
