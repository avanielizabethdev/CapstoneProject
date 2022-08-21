package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class BaseClass {
	
public static WebDriver driver;
	
	@BeforeMethod
	public void SetUp() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:8082/medicare/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		
	}
	
	@AfterMethod
	public void TearDown() {
		
		driver.quit();
	}

}
