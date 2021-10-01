package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.google.com/");
		String title= driver.getTitle();
		System.out.println(title);
		if(title.equalsIgnoreCase("google")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("incorrect title");
		}
		driver.findElement(By.name("q")).sendKeys("ganesha");
		driver.findElement(By.name("btnK")).click();
	driver.quit();

	}

}
