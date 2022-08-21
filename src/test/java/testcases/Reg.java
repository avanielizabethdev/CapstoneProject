package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;

public class Reg extends BaseClass{
	
	@Test
	public void test() {
	
		LoginPage login = new LoginPage();
		login.LoginFunction("kn@gmail.com", "12345");
		
		WebElement manageProd =driver.findElement(By.xpath("//a[@href='/medicare/manage/product']"));
		manageProd.click();
	
		
		
	
	}
	

}
