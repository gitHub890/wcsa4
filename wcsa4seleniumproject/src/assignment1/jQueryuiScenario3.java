package assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class jQueryuiScenario3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://jqueryui.com/droppable/");
		WebElement src = driver.findElement(By.xpath("//p[.='Drag me to my target']]"));
		WebElement target = driver.findElement(By.xpath("//p[.='Drop here']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(src, target).perform();
		
		
		
	}

}
