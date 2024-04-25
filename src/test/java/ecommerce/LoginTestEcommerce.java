package ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestEcommerce extends BaseClass {
	@Test
	public void LoginSuccessTest() {
		
		LoginPageFunctions.LoginFunction("standard_user", "secret_sauce");
		WebElement Product = chromeDriver.findElement(By.className("title"));
		Assert.assertTrue(Product.isDisplayed(), "Product is not displayed");
	}

	@Test
	public void LoginFailureTest() {
		LoginPageFunctions.LoginFunction("standard_user", "secret_sauce1");
		WebElement ErrorMsg = chromeDriver.findElement(By.xpath("//h3"));
		Assert.assertTrue(ErrorMsg.isDisplayed(), "Error Message is not displayed");
	}

	
}
