package appModular;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.PageObjects;

public class BookTicket{
    
	private PageObjects pageObjects;
	private WebDriver driver;

    @BeforeClass
    public void getCtx(ITestContext ctx){
        driver = (WebDriver) ctx.getAttribute("driver");
        pageObjects = pageObjects.init(driver);
        pageObjects = PageFactory.initElements(driver, PageObjects.class);
    }
    @Test
    public void BookTicket() {
    	pageObjects.PurchaseTicket();
    }


}