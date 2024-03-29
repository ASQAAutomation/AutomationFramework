package tests;

import org.testng.annotations.Test;

import base.TestBase;
import pageObjects.Login.LoginPage;

public class HomeTest extends TestBase{
	
	@Test
	public void loginusertest() {
		
		LoginPage login = new LoginPage(driver);
		login.dologin("standard_user", "secret_sauce");
	}

}
