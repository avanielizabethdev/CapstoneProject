package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import testcases.BaseClass;
public class LoginPage {
	
	WebDriver driver = BaseClass.driver;
	
	@FindBy(id = "login")
	WebElement LoginLink;
	
	@FindBy(id = "username")
	WebElement Email;
	
	@FindBy(id ="password")
	WebElement Password;
	
	@FindBy(xpath ="//input[@class='btn btn-primary']")
	WebElement LoginBtn;
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void LoginFunction(String Usrname, String Pswd) {
		
		LoginLink.click();
		Email.sendKeys(Usrname);
		Password.sendKeys(Pswd);
		LoginBtn.click();
		
	}
	
}
