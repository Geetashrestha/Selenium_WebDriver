package seleniumPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebElementsMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=InitializeWebDriver.getDriver("chrome");
		driver.get("http://demo.testfire.net/login.jsp");
		
		driver.findElement(By.id("uid")).sendKeys("Geeta");
		driver.findElement(By.name("btnSubmit")).click();
		
		Alert alert=driver.switchTo().alert();
		
		System.out.println(alert.getText());
		String actualText=alert.getText();
			if (actualText.equals("You must enter a valid password")) {
				System.out.println("Alert is displayed same as expected");
			}else {
				System.out.println("Alert is not didplayed same as expected");
			}
		Thread.sleep(1000);
		alert.accept();
		driver.findElement(By.id("uid")).clear();
		driver.findElement(By.id("uid")).sendKeys("Shrestha");
		System.out.println();driver.findElement(By.id("uid")).getCssValue("color");
		driver.findElement(By.id("passw")).sendKeys("Demo1234");
		System.out.println(driver.findElement(By.id("passw")).getAttribute("type"));
    	driver.findElement(By.name("btnSubmit")).click();
	}

}
