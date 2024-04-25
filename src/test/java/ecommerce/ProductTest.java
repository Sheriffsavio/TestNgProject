package ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductTest extends BaseClass {
	@Test

	public void AddToCartTest() {
		LoginPageFunctions.LoginFunction("standard_user", "secret_sauce");
		WebElement AddToCart = chromeDriver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		AddToCart.click();
		CartPageFunctions.GoToCart();
		WebElement CartItem = chromeDriver.findElement(By.className("inventory_item_name"));
		Assert.assertTrue(CartItem.isDisplayed(), "Cart Item is not displayed");
		Assert.assertEquals(CartItem.getText(), "Sauce Labs Backpack");
	}

}
