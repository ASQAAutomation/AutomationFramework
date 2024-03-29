package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;
import pageObjects.Login.HomePage;
import pageObjects.Login.LoginPage;
import pageObjects.Login.YourCart;

public class SaucedemoEtoEtest extends TestBase {

	LoginPage login;
	HomePage home;
	YourCart cart;

	@BeforeClass
	public void setupClass() {
		login = new LoginPage(driver);
		home = new HomePage(driver);
		cart = new YourCart(driver);
	}

	@Test(priority = 0)
	public void loginusertest() {
		login.dologin("standard_user", "secret_sauce");
		String actualheadertext = home.getheader().getText();
		Assert.assertEquals(actualheadertext, "Swag Labs");
		String actualproducttext = home.getProduct().getText();
		Assert.assertEquals(actualproducttext, "Products");
		// test.log(LogStatus.INFO)

	}

	@Test(priority = 1)
	public void addtocart() {

		home.addtocart1();
		home.cartlinkclick();
		// String actualtitle = cart.pageTitle().getText();
		// Assert.assertEquals(actualtitle, "Your Cart");
		// String actualitem = cart.Item().getText();
		// Assert.assertEquals(actualtitle, "Sauce Labs Bike Light");
	}

	@Test(priority = 2)
	public void cartpage() {
		String actualtitle = cart.pageTitle().getText();
		Assert.assertEquals(actualtitle, "Your Cart");
		//String actualitem = cart.item().getText();
		//Assert.assertEquals(actualitem, "Sauce Labs Bike Light");
		
		//Rather than storing the actual text in var, we can directly validate that if we dno not have to use that var anywhere else
		System.out.println(cart.item().getText());
		Assert.assertEquals(cart.item().getText(), "Sauce Labs Bike Light");
		
		String actualprice = cart.pricetag().getText();
		Assert.assertEquals(actualprice, "$9.99");
		System.out.println(actualprice);
		if (actualprice.equals("$9.98") ) {
			cart.checkout();
		} else {
			cart.remove();
		}
		//cart.checkout();

	}

}
