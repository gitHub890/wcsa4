package assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario5BlueStone {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=Cj0KCQiAtbqdBhDvARIsAGYnXBNqhnPLaYGl-5TFe0Fq6f4eAPe2azHPmWGY_0T4CD-v6HxSUw_cigIaAu8PEALw_wcB");
		Thread.sleep(2000);
		driver.findElement(By.id("confirmBtn")).click();
		WebElement target = driver.findElement(By.xpath("//a[.='Rings ']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Diamond Rings']")).click();
		//driver.findElement(By.xpath("(//i[@class='icon-ion-chevron-down'])[1]"));
		//driver.findElement(By.xpath("(//span[@class='title style-fill i-right'])[1]"));
		driver.findElement(By.xpath("//span[.='Price']")).click();
	}

}
