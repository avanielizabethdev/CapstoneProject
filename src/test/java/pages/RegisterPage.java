package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import testcases.BaseClass;

public class RegisterPage {
	
	WebDriver driver = BaseClass.driver;
	
	@FindBy(xpath="//a[text()='Sign Up']")
	WebElement RegLink;
	
	@FindBy(id="firstName")
	WebElement FirstName;
	
	@FindBy(id="lastName")
	WebElement LastName;
	
	@FindBy(id="email")
	WebElement Email;
	
	@FindBy(id="contactNumber")
	WebElement Contact;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(id="confirmPassword")
	WebElement ConfirmPass;
	
	@FindBy(id="role1")
	WebElement Role;
	
	@FindBy(xpath ="//button[@class='btn btn-primary']")
	WebElement NextBtn;
	
	@FindBy(xpath ="//input[@id='addressLineOne']")
	WebElement address1;
	
	@FindBy(xpath ="//input[@id='addressLineTwo']")
	WebElement address2;
	
	@FindBy(xpath ="//input[@id='city']")
	WebElement city;
	
	@FindBy(xpath ="//input[@id='postalCode']")
	WebElement postalcode;
	
	@FindBy(xpath ="//input[@id='state']")
	WebElement state;
	
	@FindBy(xpath ="//input[@id='country']")
	WebElement country;
	
	@FindBy(xpath ="//button[@name='_eventId_confirm']")
	WebElement confirmBtn;
	
	@FindBy(xpath ="//a[@href='/medicare/membership?execution=e1s3&_eventId_submit']")
	WebElement finalConfirm;
	
	@FindBy(xpath ="//h1[text()='Welcome!']")
	WebElement welcomeMsg;
	
	
	public RegisterPage() {
		
		PageFactory.initElements(driver, this);		
		
	}
	
	public void RegFunction(String Fstname, String Lstname, String email, String Contnum, String pswd, String confmpswd,String addressOne,String addressTwo,String City,String postCode,String State,String Country) {
		
		RegLink.click();
		FirstName.sendKeys(Fstname);
		LastName.sendKeys(Lstname);
		Email.sendKeys(email);
		Contact.sendKeys(String.valueOf(Contnum));
		//Contact.sendKeys(Contnum);
		Password.sendKeys(pswd);
		ConfirmPass.sendKeys(confmpswd);
		Role.click();
		NextBtn.click();
		
		address1.sendKeys(addressOne);
		address2.sendKeys(addressTwo);
		city.sendKeys(City);
		postalcode.sendKeys(postCode);
		state.sendKeys(State);
		country.sendKeys(Country);
		confirmBtn.click();
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", finalConfirm);
		//finalConfirm.click();
		
		String ActualMsg = welcomeMsg.getText();
		String ExpMsg = "Welcome!";
		Assert.assertEquals(ActualMsg, ExpMsg);
	}
	

}
