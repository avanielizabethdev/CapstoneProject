package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageProductPage;

public class ManageProductTest extends BaseClass{
	
	@Test
	public void ProductTest() {
		
		LoginPage login = new LoginPage();
		login.LoginFunction("vk@gmail.com", "admin");
		
		ManageProductPage prodPage = new ManageProductPage();
		prodPage.MngProd("test","testbrand","test","15","1","C:\\Users\\91952\\Downloads\\image.jfif");
		
		Select prodCat =new Select(driver.findElement(By.xpath("//select[@id='categoryId']")));
		prodCat.selectByValue("3");
		
		WebElement saveBtn =driver.findElement(By.xpath("//input[@type='submit']"));
		saveBtn.click();
		
		WebElement SuccessMsg=driver.findElement(By.xpath("//div[@class='alert alert-info fade in']"));
		
		String ActualMsg = SuccessMsg.getText();
		String ExpMsg = "Product submitted successfully!";
		
		Assert.assertEquals(ActualMsg, ExpMsg);
		
	}

}
