package TestNGSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginTest {
	WebDriver driver;
	
	By username= By.id("username");
	By password = By.id("password");
	//By login= By.id("loginBtn");
	By signup=By.linkText("Sign up");
	
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test
	public void singuptest() {
		Assert.assertTrue(driver.findElement(signup).isDisplayed());
	}
	
	public void login() {
		driver.findElement(username).sendKeys("abc@gmail.com");
		driver.findElement(password).sendKeys("12345");
	}
	

	
}
