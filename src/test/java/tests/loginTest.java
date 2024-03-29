package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;
import pageObjects.Login.HomePage;
import pageObjects.Login.LoginPage;

public class loginTest extends TestBase{
	
	LoginPage login;
	HomePage home;
	
	@BeforeClass
	public void setupClass() {
		
	}
	
	@Test (priority = 0)
	public void loginusertest() {
		
		 login = new LoginPage(driver);
		login.dologin("standard_user", "secret_sauce");
	}
	@Test (priority = 1)
	public void addtocart() {
		
		 home = new HomePage(driver);
		login.dologin("standard_user", "secret_sauce");
	}

}
