package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestBase {
	// setup method
	// teamdown method

	public WebDriver driver;
	public String browser = "chrome";

	// @BeforeSuite
	@BeforeTest

	public void setup() {
		if (browser.equalsIgnoreCase("Chrome")) {
			// WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\AkhilAnu\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			// driver.get("https://google.com");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("FireFox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://saucedemo.com"); 

	}

	// @AfterSuite
	@AfterTest
	public void tearDown() {
		//if (driver != null) {
		//	driver.quit();
		}

	}



