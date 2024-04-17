package Riffygio.TestNgProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass{
	
	public void LoginFunction(String UsernameValue, String PasswordValue) {
		// 4. Click on Login
		WebElement Login = chromeDriver.findElement(By.className("login"));
		Login.click();

		// 5. Enter Email Address
		WebElement Email = chromeDriver.findElement(By.name("user_login"));
		Email.sendKeys(UsernameValue);

		// 6. Enter Password
		WebElement Password = chromeDriver.findElement(By.id("password"));
		Password.sendKeys(PasswordValue);

		// 7. Select Remember Me
		WebElement RememberMe = chromeDriver.findElement(By.id("remember-me"));
		RememberMe.click();

		// 8. Click Login Button
		WebElement LoginBtn = chromeDriver.findElement(By.name("btn_login"));
		LoginBtn.click();
	}

	@Test
	public void LoginSuccessTest() {
		LoginFunction("abc@xyz.com", "correctpassword");
	}

	@Test
	public void LoginFailureTest() {
		LoginFunction("abc@xyz.com", "Incorrectpassowrd@1");
	
		// 9. Validate the error message
		WebElement ErrorMsg = chromeDriver.findElement(By.id("msg_box"));

		Assert.assertTrue(ErrorMsg.isDisplayed());

		String ExpMsg = "The email or password you have entered is invalid.";
		String ActMsg = ErrorMsg.getText();

		Assert.assertEquals(ActMsg, ExpMsg);

	}

}
