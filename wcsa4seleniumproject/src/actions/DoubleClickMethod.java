package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_1.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get("http://desktop-qg2rdlr/login.do");
			
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
			
			driver.findElement(By.xpath("//a[.='Login']")).click(); //by using text
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(@class,'content administration')]")).click();
			driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
			driver.findElement(By.xpath("//input[contains(@id,'uploadNewLogoOption')]")).click();
			WebElement target = driver.findElement(By.xpath("formCustomInterfaceLogo.logo"));
			
			Actions act = new Actions(driver);
			//to perform double click action
			act.doubleClick(target).perform();
			
			////input[contains(@id,'uploadNewLogoOption')] 
			
			//Thread.sleep(2000);
			//target.click(); 	
	}

}
