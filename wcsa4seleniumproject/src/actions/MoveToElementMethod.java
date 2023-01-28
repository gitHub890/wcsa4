package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.diver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=CjwKCAiAqaWdBhAvEiwAGAQltlScPedvX_CcUIuAH55L5uPAZQnNnYi40xKrd0ND6J7cqg5wH7ejGxoCpzMQAvD_BwE");
		Thread.sleep(2000);
		driver.findElement(By.id("confirmBtn")).click();
		WebElement target=driver.findElement(By.xpath("//a[.='Watch Jewellery ']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Band']")).click();
		
		
		
		
		
		//\\a[.='Watch Jewellery']
		////a[@title='Band']
	}

}
