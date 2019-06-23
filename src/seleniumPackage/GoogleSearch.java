package seleniumPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearch {

	public static void main(String[] args) {
		
		  
		WebDriver driver= InitializeWebDriver.getDriver("Chrome");
	
		driver.get("https://www.google.com/");
		WebElement element= driver.findElement(By.name("q")); // element locator by name
		element.sendKeys("Selenium"); // to enter in text box
	    element.sendKeys(Keys.ENTER);
	    String strActualUrl = driver.getCurrentUrl()	;
	    if (strActualUrl.equals("https://www.seleniumhq.org/download/")) {
			   System.out.println("Pass");
		   }
		   else  {
			   System.out.println("Fail");
		   }
	    driver.findElement (By.xpath("//h3[text() = 'Selenium - Web Browser Automation']")).click();// element loactor by xpath
	    
	   driver.findElement(By.linkText("Download")).click(); // element loacator by linktext
	   
	   String strActualUrl1 = driver.getCurrentUrl()	;
	   if (strActualUrl1.equals("https://www.seleniumhq.org/download/")) {
		   System.out.println("Pass");
	   }
	   else  {
		   System.out.println("Fail");
	   }
		
	}
}
