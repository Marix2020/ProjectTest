package stepDefinitions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import core.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Initializer extends Base {

	@Before
	public void beforeHooks() {

		// WebDriver Manager to create instance of each browser at the run time
		if (Base.getBrowserName().equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
	
		}else if (Base.getBrowserName().equals("IE")) {	
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			
			}else if (Base.getBrowserName().equals("FF")) {			
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				
		}
		
		//windows management
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(getPLTimeout(), TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(getImpwait(), TimeUnit.SECONDS);

	}

	@After
	public void afterHooks() {
		
		Base.tearDown();

	}

}
