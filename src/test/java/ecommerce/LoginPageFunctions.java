package ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPageFunctions extends BaseClass {
	public static void LoginFunction(String UsernameValue, String PasswordValue) {
		WebElement Username = chromeDriver.findElement(By.id("user-name"));
		Username.sendKeys(UsernameValue);
		WebElement Password = chromeDriver.findElement(By.id("password"));
		Password.sendKeys(PasswordValue);
		WebElement LoginButton = chromeDriver.findElement(By.name("login-button"));
		LoginButton.click();
	}
}
