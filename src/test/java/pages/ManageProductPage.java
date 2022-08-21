package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import testcases.BaseClass;

public class ManageProductPage {
	
	WebDriver driver = BaseClass.driver;
	
	@FindBy(xpath="//a[@href='/medicare/manage/product']")
	WebElement manageProd;
	
	@FindBy(id="name")
	WebElement prodName;
	
	@FindBy(id="brand")
	WebElement prodBrand;
	
	@FindBy(xpath="//textarea[@id='description']")
	WebElement prodDescr;
	
	@FindBy(id="unitPrice")
	WebElement prodUp;
	
	@FindBy(id="quantity")
	WebElement prodQty;
	
	@FindBy(id="file")
	WebElement prodFile;
	
	/*@FindBy(xpath="//select[@id='categoryId']")
	Select prodCat;*/
	
	public ManageProductPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void MngProd(String productName, String productBrand, String productDescription,String productUnitPrice,String productQuantity,String fileUpload) {
		
		//manageProd.click();
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", manageProd);
		prodName.sendKeys(productName);
		prodBrand.sendKeys(productBrand);
		prodDescr.sendKeys(productDescription);
		prodUp.clear();
		prodUp.sendKeys(productUnitPrice);
		prodQty.clear();
		prodQty.sendKeys(productQuantity);
		prodFile.sendKeys(fileUpload);
		//prodCat.selectByValue("3");
	}

}
