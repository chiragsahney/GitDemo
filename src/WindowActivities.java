import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		
		//get is preferred as selenium waits for the page to fully loaded.
		driver.get("https://www.google.com");
		
		
		driver.navigate().to("https://www.steamcommunity.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();
	}

}
