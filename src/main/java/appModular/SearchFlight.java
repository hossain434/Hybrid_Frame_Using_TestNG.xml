package appModular;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.PageObjects;

public class SearchFlight{
    
	 private PageObjects pageObjects;
	 private WebDriver driver;

    @SuppressWarnings("static-access")
	@BeforeClass
    public void getCtx(ITestContext ctx){
        WebDriver driver = (WebDriver) ctx.getAttribute("driver");
        pageObjects = pageObjects.init(driver);
        pageObjects = PageFactory.initElements(driver, PageObjects.class);
    }
    
    @Test
    public void searchFlight() {
    	
    	pageObjects.FlightSearch();
    	
     
    }

}