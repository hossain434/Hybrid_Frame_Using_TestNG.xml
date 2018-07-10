package appModular;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import driverFactory.DriverManager;
import driverFactory.DriverManagerFactory;

public class BaseTest {

    private WebDriver driver;
    private DriverManager driverManager;

    @BeforeTest
    @Parameters({ "browser" })
    public void setUpDriver(String browser){
    	//driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
    	driverManager = DriverManagerFactory.getManager(browser);
    	 driver = driverManager.getDriver();
        driver.get("http://newtours.demoaut.com/mercurywelcome.php");
    }
    
    @BeforeClass
    public void storeDriver(ITestContext ctx){
        ctx.setAttribute("driver", driver);
    }

}