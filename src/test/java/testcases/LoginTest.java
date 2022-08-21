package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;


public class LoginTest extends BaseClass{
	
	@Test
	public void UserLogin() {
		
		LoginPage login = new LoginPage();
		login.LoginFunction("kn@gmail.com", "12345");	
	}
	
	@Test
	public void LoginFailiureTest() {
		
		LoginPage login = new LoginPage();
		login.LoginFunction("kn@gmail.com", "125");
		
		/*WebElement Email = driver.findElement(By.id("username"));
		WebElement Password = driver.findElement(By.id("password"));
		WebElement LoginBtn = driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
				
		Email.sendKeys("kn@gmail.com");
		Password.sendKeys("125");
		LoginBtn.click();*/
		
		WebElement ErrorMsg=driver.findElement(By.xpath("//div[@class='alert alert-danger fade in']"));
		
		String ActualMsg = ErrorMsg.getText();
		String ExpMsg = "Username and Password is invalid!";
		
		Assert.assertEquals(ActualMsg, ExpMsg);
	}
	
	@Test
	public void AdminLogin() {
		
		LoginPage login = new LoginPage();
		login.LoginFunction("vk@gmail.com", "admin");	
	}


}
