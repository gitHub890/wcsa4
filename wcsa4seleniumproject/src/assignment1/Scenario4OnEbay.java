package assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario4OnEbay {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://pages.ebay.in/photocenter/");
		driver.findElement(By.name("_nkw")).sendKeys("apple Watches");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath(""));
		
	}

}
