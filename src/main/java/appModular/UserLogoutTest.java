package appModular;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.PageObjects;

public class UserLogoutTest {

	private WebDriver driver;
	private PageObjects pageObjects;

	@BeforeClass
	public void getCtx(ITestContext ctx) {
		driver = (WebDriver) ctx.getAttribute("driver");
		pageObjects = PageFactory.initElements(driver, PageObjects.class);
	}

	@Test
	public void logout() throws InterruptedException {
		pageObjects.ClickLogoutButton();

	}

	@AfterTest
	public void closebrowser() {
		driver.close();
		driver.quit();
	}
}