package driverFactory;

public class DriverManagerFactory {

    public static DriverManager getManager(String browser) {

        DriverManager driverManager;
 
        
        switch (browser) {
            
		case "CHROME":
                driverManager = new ChromeDriverManager();
                break;
            default:
            	driverManager = new FirefoxDriverManager();
                break;
        }
        return driverManager;

    }
}