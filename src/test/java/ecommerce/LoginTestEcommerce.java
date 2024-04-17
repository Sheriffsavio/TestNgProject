package ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestEcommerce extends BaseClass {
	@Test
	public void LoginSuccessTest() {
		LoginFunction("standard_user", "secret_sauce");
		WebElement Product = chromeDriver.findElement(By.className("title"));
		Assert.assertTrue(Product.isDisplayed(), "Product is not displayed");
	}

	@Test
	public void LoginFailureTest() {
		LoginFunction("standard_user", "secret_sauce1");
		WebElement ErrorMsg = chromeDriver.findElement(By.xpath("//h3"));
		Assert.assertTrue(ErrorMsg.isDisplayed(), "Error Message is not displayed");
	}

	public void LoginFunction(String UsernameValue, String PasswordValue) {
		WebElement Username = chromeDriver.findElement(By.id("user-name"));
		Username.sendKeys(UsernameValue);
		WebElement Password = chromeDriver.findElement(By.id("password"));
		Password.sendKeys(PasswordValue);
		WebElement LoginButton = chromeDriver.findElement(By.name("login-button"));
		LoginButton.click();
	}
}
