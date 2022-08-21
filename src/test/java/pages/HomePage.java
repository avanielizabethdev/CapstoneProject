package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import testcases.BaseClass;

public class HomePage {
	
	WebDriver driver = BaseClass.driver;
	
	@FindBy(xpath="//a[@href='/medicare/show/category/1/products']")
	WebElement Category1;
	
	@FindBy(xpath="//a[@href='/medicare/cart/add/1/product']")
	WebElement selectProd;
	
	@FindBy(id="username")
	WebElement usname;
	
	@FindBy(id="password")
	WebElement pswd;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	WebElement lgnbtn;
	
	@FindBy(xpath="//*[@href='/medicare/cart/validate']")
	WebElement checkOut;
	
	@FindBy(xpath="//a[@href='/medicare/cart/checkout?execution=e1s1&_eventId_addressSelection&shippingId=1']")
	WebElement selectBtn;
	
	@FindBy(xpath="//input[@id='cardNumber']")
	WebElement cardNum;
	
	@FindBy(xpath="//input[@id='expityMonth']")
	WebElement expMonth;
	
	@FindBy(xpath="//input[@id='expityYear']")
	WebElement expYear;
	
	@FindBy(xpath="//input[@id='cvCode']")
	WebElement cvCode;
	
	@FindBy(xpath="//a[text()='Pay']")
	WebElement payBtn;
	
	@FindBy(xpath="//div[@class='alert alert-success']")
	WebElement successMsg;
	
	
	
		
	public HomePage() {
		
		PageFactory.initElements(driver, this);		
		
	}
	
	public void goToCart(String username, String password, String cardNumber,String experiMonth,String experiYear,String cvcode) {
		
		Category1.click();
		//selectProd.click();
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", selectProd);
		
		usname.sendKeys(username);
		pswd.sendKeys(password);
		lgnbtn.click();
		
		//javscript click
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", checkOut);
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", selectBtn);
		
		cardNum.sendKeys(cardNumber);
		expMonth.sendKeys(experiMonth);
		expYear.sendKeys(experiYear);
		cvCode.sendKeys(cvcode);
		payBtn.click();
				
		String ActualMsg = successMsg.getText();
		String ExpMsg = "Your Order is Confirmed!!";
		Assert.assertEquals(ActualMsg, ExpMsg);
	
	}

}
