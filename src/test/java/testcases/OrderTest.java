package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.HomePage;

public class OrderTest extends BaseClass{

	@Test
	public void cartPart() {
		
		HomePage cart =  new HomePage();
		cart.goToCart("kn@gmail.com", "12345","424242424242","12","2022","2222");
		
	}

}
