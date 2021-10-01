package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://app.hubspot.com/login?hubs_signup-url=www.hubspot.com/&hubs_signup-cta=homepage-nav-login&_conv_v=vi:1*sc:1*cs:1631453224*fs:1631453224*pv:2*seg:{10031564.1}&_conv_s=si:1*sh:1631453224236-0.9032377134383307*pv:2&__cf_chl_jschl_tk__=pmd_fSsl_OF63tqTWTR3TotLJU866K.xc1S8bcV5Q9ae9ns-1631453238-0-gqNtZGzNAxCjcnBszQfR");
		
		//JavaScriptUtil.

	}

}
