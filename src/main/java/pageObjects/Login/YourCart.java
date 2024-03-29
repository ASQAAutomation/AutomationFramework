package pageObjects.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourCart {

	public WebDriver driver;

	public YourCart(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//span[@class ='title']") WebElement Title;
	@FindBy(xpath = "//div[@class = 'cart_item_label']/a[@id = 'item_0_title_link']/div[contains (text(),'Sauce Labs Bike Light')]")
	WebElement Item;
	@FindBy(xpath = "//div[@class = 'inventory_item_price']") WebElement Pricetag;
	@FindBy(id = "remove-sauce-labs-bike-light") WebElement RemoveBtn;
	@FindBy (id = "checkout") WebElement checkoutBtn;
	@FindBy (id = "continue-shopping") WebElement continueshop;
	
	public WebElement pageTitle() {
		return Title;
		}
	public WebElement item() {
		return Item;
		}
	public WebElement pricetag() {
		return Pricetag;
		}
	public void remove() {
		RemoveBtn.click();
	}
	public void checkout() {
		checkoutBtn.click();
	}
	public void continueshoping() {
		continueshop.click();
	}

}
