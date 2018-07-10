package appModular;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestContext;
public class UserLoginTest extends BaseTest{
    
    private WebDriver driver;
    private PageObjects pageObjects;
    
    @BeforeClass
    public void getCtx(ITestContext ctx){
        driver = (WebDriver) ctx.getAttribute("driver");
        pageObjects = PageFactory.initElements(driver, PageObjects.class);
   }

	@Test
	@Parameters({"username", "password"})
    public void login(String username, String password) throws InterruptedException {
    	 
         //validate if the login page (or username) is loaded
         Assert.assertTrue(pageObjects.isAt()); 
    	pageObjects.EnterUserName(username);
    	pageObjects.EnterPassword(password);
    	pageObjects.ClickLoginButton();
    }

}