package ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CartPageFunctions extends BaseClass {
	public static void GoToCart() {
		WebElement CartButton = chromeDriver.findElement(By.className("shopping_cart_link"));
		CartButton.click();
	}
}