package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleChcekboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("justAnInputBox")).click();
		selectchoicevalues(driver,"choice 6 2 2","choice 1");
		
	}
		public static void selectchoicevalues(WebDriver driver,String... value) {
			List<WebElement> choicelist=driver.findElements(By.xpath("//div[@class='comboTreeDropDownContainer']//ul//li/span[@class='comboTreeItemTitle']"));
			for(int i=0;i<choicelist.size();i++) {
				//System.out.println(choicelist.get(i).getText());
				String text=choicelist.get(i).getText();
				for(int k=0;k<value.length;k++) {
					
					if(text.equals(value[k])){
					choicelist.get(i).click();
					break;
				}
			
			}}
			
		}
	}


