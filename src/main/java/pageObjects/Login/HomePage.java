package pageObjects.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[contains(text(),'Swag Labs')]") WebElement SWAGheader;
	@FindBy(xpath = "//span[contains(text(),'Products')]") WebElement Producttag;
	@FindBy(id = "add-to-cart-sauce-labs-bike-light") WebElement addtocartbtn;
	@FindBy(xpath = "//a[@class = 'shopping_cart_link']") WebElement cartlink;
	
	public WebElement getheader() {
		return SWAGheader;
	}
	public WebElement getProduct() {
		return Producttag;
	}
	public void addtocart1() {
		addtocartbtn.click();
	}
	public void cartlinkclick() {
		cartlink.click();
	}
	
}
