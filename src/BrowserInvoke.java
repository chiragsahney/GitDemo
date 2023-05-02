import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserInvoke {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Google search for Counter Strike 2
		//driver.get("https://www.google.com");
		//driver.findElement(By.id("APjFqb")).sendKeys("Counter Strike 2");
		//driver.findElement(By.name("q")).sendKeys("Counter Strike 2");
		//driver.findElement(By.className("gLFyf")).sendKeys("Counter Strike 2");
		//driver.findElement(By.tagName("textarea")).sendKeys("Counter Strike 2");
		//driver.findElement(By.cssSelector("textarea.gLFyf")).sendKeys("Counter Strike 2");
		//driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Counter Strike 2");
		//Thread.sleep(500);
		//driver.findElement(By.className("gNO89b")).click();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Chirag");
		driver.findElement(By.name("inputPassword")).sendKeys("password");
		driver.findElement(By.className("submit")).click();
//		Thread.sleep(2000);
//		System.out.println(driver.findElement(By.tagName("p")).getText());
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("ChiragTest");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Chirag@test.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("chiragemail@test.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("1234567890");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("ChiragTest");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	}

}
