package ecommerce;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public static WebDriver chromeDriver;

	@BeforeMethod
	public void SetUp() {

		// 1. Open Chrome
		chromeDriver = new ChromeDriver();

		// 2. Launch Ecommerce
		chromeDriver.get("https://www.saucedemo.com/");

		// 3. Maximize the screen
		chromeDriver.manage().window().maximize();
		chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@AfterMethod
	public void TearDown() {

		// 10. Close the browser
		chromeDriver.close();

	}

}
