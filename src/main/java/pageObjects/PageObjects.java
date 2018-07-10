package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import appModular.Page;

public class PageObjects extends Page {
	private WebDriverWait wait;
	private WebDriver driver;
	// Define User name Field
	@FindBy(how = How.NAME, using = "userName")
	private WebElement username;

	// Define Password Field
	@FindBy(how = How.NAME, using = "password")
	private WebElement password;

	// Define Login Button
	@FindBy(how = How.NAME, using = "login")
	private WebElement login;

	// Define Book Flight
	@FindBy(how = How.CSS, using = "tbody>tr:nth-child(2)>td:nth-child(2)>a")
	private WebElement Flights;

	// Define Find flight (click continue)
	@FindBy(how = How.CSS, using = "tbody>tr:nth-child(14)>td>input[name='findFlights']")
	private WebElement findflights;

	// Define reserve flight
	@FindBy(how = How.NAME, using = "reserveFlights")
	private WebElement reserveFlights;

	// Define first name)
	@FindBy(how = How.NAME, using = "passFirst0")
	private WebElement cc_frst_name;

	// Define Last name
	@FindBy(how = How.NAME, using = "passLast0")
	private WebElement cc_last_name;

	// Define CC number
	@FindBy(how = How.NAME, using = "creditnumber")
	private WebElement creditnumbers;

	// Define purchase ticket
	@FindBy(how = How.NAME, using = "buyFlights")
	private WebElement buyFlights;

	// Define logout Button
	@FindBy(how = How.CSS, using = "div>table>tbody>tr>td:nth-child(2)>table>tbody>tr:nth-child(2)>td>table>tbody>tr>td:nth-child(1)")
	private WebElement logout;

	public PageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, 30);
	}
	
	public static PageObjects init(WebDriver driver) {
	    return new PageObjects(driver);
	}
    
	// Define User name Enter Method
	public void EnterUserName(String usernametext) throws InterruptedException {
		this.username.sendKeys(usernametext);

	}
	
    @Override
    public boolean isAt(){
        return this.username.isDisplayed();
    }

	// Define Password Enter Method
	public void EnterPassword(String passwordtext) throws InterruptedException {
		password.sendKeys(passwordtext);

	}

	// Define Login Button Click Method
	public void ClickLoginButton() {
		wait.until(ExpectedConditions.elementToBeClickable(this.login));
		login.click();
	}

	// Search Flight
	public void FlightSearch() {
		wait.until(ExpectedConditions.elementToBeClickable(this.Flights));
		Flights.click();
		wait.until(ExpectedConditions.elementToBeClickable(this.findflights));
		findflights.click();
		wait.until(ExpectedConditions.elementToBeClickable(this.reserveFlights));
		reserveFlights.click();
		
	}
	
	

	// Customer details
	public void cc_frst_name() {
		wait.until(ExpectedConditions.elementToBeClickable(this.cc_frst_name));
		cc_frst_name.sendKeys("Md");
	}
	public void cc_last_name() {
		wait.until(ExpectedConditions.elementToBeClickable(this.cc_last_name));
		cc_last_name.sendKeys("Md");
	}
		public void creditnumbers() {
		wait.until(ExpectedConditions.elementToBeClickable(this.creditnumbers));
		creditnumbers.sendKeys("123");

	}
		public void CustomerDetails(String cc_frst_name, String cc_last_name, int creditnumbers) {
			this.cc_frst_name.sendKeys("Md");
			this.cc_last_name.sendKeys("Md");
			this.creditnumbers.sendKeys("123");
			
		}
	// Book Flight
	public void PurchaseTicket() {
		wait.until(ExpectedConditions.elementToBeClickable(this.buyFlights));
		buyFlights.click();
	}

	// Define Login Button Click Method
	public void ClickLogoutButton() {
		wait.until(ExpectedConditions.elementToBeClickable(this.logout));
		logout.click();
	}

}