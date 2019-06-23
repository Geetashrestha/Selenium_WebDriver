package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebDriverExample   {

	public static void main(String[] args) throws InterruptedException{ 
		// TODO Auto-generated method stub

		WebDriver driver= InitializeWebDriver.getDriver("Chrome");
		driver.get("https://www.flipkart.com/");
		
		System.out.println(driver.getTitle());
		
		driver.navigate().back();// go to previous page
		Thread.sleep(1000);
		driver.navigate().forward();// go to next page
		Thread.sleep(1000);
		driver.navigate().refresh();// refresh browser
		Thread.sleep(1000);
		driver.navigate().to("https://www.google.com/");// to navigate to other webpage
		String actualURL=driver.getCurrentUrl()	;
		System.out.println(driver.getCurrentUrl());// to get the current url webpage
		
		if (actualURL.equals("https://www.google.com/")) {
			System.out.println("actual url is same as expected");
		}
		else {
			System.out.println(("actual url is not same as expected"));
		}
		//System.out.println(driver.getPageSource());
		Thread.sleep(1000);
		driver.close();// to close the window
	}

}