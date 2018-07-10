package appModular;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.PageObjects;

public class PassengerDetails{

    private WebDriver driver;
    private PageObjects pageObjects;
	String cc_frst_name;
	String cc_last_name;
	int creditnumbers;
    @BeforeClass
    public void getCtx(ITestContext ctx){
        driver = (WebDriver) ctx.getAttribute("driver");
        pageObjects = pageObjects.init(driver);
        pageObjects = PageFactory.initElements(driver, PageObjects.class);
    }
    
    @Test
    @Parameters({"cc_frst_name", "cc_last_name", "creditnumbers"})
    public void enterDetails() {
    	
		pageObjects.CustomerDetails(cc_frst_name, cc_last_name, creditnumbers);

    }

}

