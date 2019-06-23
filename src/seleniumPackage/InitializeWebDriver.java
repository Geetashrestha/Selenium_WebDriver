package seleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public  class InitializeWebDriver{
   static WebDriver driver;
	
	public  static WebDriver getDriver(String browserType){
	
		if (browserType.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
			
			driver= new InternetExplorerDriver(); 
		}
		
		else if (browserType.equalsIgnoreCase("CHROME")) {
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				
				driver= new ChromeDriver(); 
				
			}
		else if (browserType.equalsIgnoreCase("FIREFOX")) {
			System.setProperty("webdriver.gecko.driver","geckodriver.exe");
			
			driver = new FirefoxDriver();
		}
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				return driver;
			
			}

	}
//https://drive.google.com/drive/folders/1rrQURLV6VVZ4aH1BlCc0rExUAhdPchnM
