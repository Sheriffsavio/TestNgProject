package Riffygio.TestNgProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {

	@Test
	public void ValidateSearchTest() {
		// 4. Search for testing and press enter button on keyboard
		WebElement Search = chromeDriver.findElement(By.id("header_srch"));
		Search.sendKeys("Testing");
		Search.sendKeys(Keys.ENTER);

	}
}
