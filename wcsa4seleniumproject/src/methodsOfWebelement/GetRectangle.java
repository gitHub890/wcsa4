package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectangle {
	public class GetLocationMethod {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_1.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			
			driver.get("https://www.selenium.dev/downloads/");
			
			WebElement download = driver.findElement(By.xpath("//h1[.='Download']"));
			Rectangle rect = download.getRect();
			int xaxis = rect.getX();
			int yaxis = rect.getY();
			
			int height = rect.getHeight();
			int width = rect.getWidth();     //o/p= 204 96 62 1110
			
			System.out.println("xaxis");
			System.out.println("yaxis");
			System.out.println("Height");
			System.out.println("Width");
		}
	}
			
			

}
