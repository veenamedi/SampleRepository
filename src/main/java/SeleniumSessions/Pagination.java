package SeleniumSessions;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pagination {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		driver.findElement(By.name("username")).sendKeys("groupautomation");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/input")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("((//div[@id='navmenu']//child::ul[@class='mlddm']/child::li)[4]/child::a")).click();
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();
		
		WebElement pages= driver.findElement(By.xpath("//*[@id=\"vContactsForm\"]/table/tbody/tr[2]/td[1]/div/select")); 
		Select select=new Select(pages);
		List<WebElement> pagelist=select.getOptions();
		System.out.println(pagelist.size());
		
		/*for(int i=1;i<pagelist.size();i++)
		{
			try {
			select.selectByIndex(i);
			}catch(Exception e) {}
		}*/
		
		List<WebElement> page=driver.findElements(By.xpath("(//div[@class='pagination'])[1]/option"));
		int j=0;
		/*while(true) {
			if(driver.findElements(By.linkText("Kamal sharma")).Size()==1) {
				selectcontact
			}
				
		}*/
}
}
