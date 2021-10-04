package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample {

	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.com/");
	String title=driver.getTitle();
	System.out.println(title);
	driver.findElement(By.name("q")).sendKeys("naveenautomations");
	driver.findElement(By.name("q")).submit();
	
	
}
}
