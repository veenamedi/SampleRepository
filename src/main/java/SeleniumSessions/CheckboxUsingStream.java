package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		System.out.println(driver.getTitle());
		List<WebElement> choicelist = driver.findElements(By.className("comboTreeInputBox"));
		
		for(int i=0;i<choicelist.size();i++) {
			String text=choicelist.get(i).getText();
			System.out.println(text);
		}
		

	}

}
