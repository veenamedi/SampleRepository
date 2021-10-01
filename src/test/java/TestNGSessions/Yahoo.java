package TestNGSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Yahoo {
WebDriver driver;
	
	By username= By.id("username");
	//By signup=By.linkText("Sign up");
	By google= By.id("tpa-google-button");
	
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@Test
	public void googletest() {
		Assert.assertTrue(driver.findElement(google).isDisplayed());
		
	}
}
