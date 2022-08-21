package testcases;

import org.testng.annotations.Test;

import pages.RegisterPage;

public class Register extends BaseClass{
	
	@Test
	public void UserReg() {
		
		RegisterPage register = new RegisterPage();
		register.RegFunction("Avani", "Dev", "avanidev@gmail.com", "9876543210", "testtest", "testtest","Balal","Kallanchira","Kasaragod","671533","Kerala","India");
	}
}
