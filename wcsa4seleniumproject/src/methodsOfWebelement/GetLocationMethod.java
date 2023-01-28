package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_1.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://www.selenium.dev/downloads/");
		
		WebElement download = driver.findElement(By.xpath("//h1[.='Download']"));
		Point Loc = download.getLocation();
		int xaxis = Loc.getX();
		int yaxis = Loc.getY();
		
		System.out.println("++");
	}
}
