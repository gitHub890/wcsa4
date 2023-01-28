package sychronization;

import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeExplicitlyWaitUsername {
	private static final char[] Check2 =null;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-63a2e9i/login.do");
		
		
	}

}
