package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplictWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= InitializeWebDriver.getDriver("Chrome");
		driver.get("https://www.amazon.in/");
		
		WebDriverWait wait =new WebDriverWait(driver,120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung");
		
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'invella Brown')]")));
				
	}

}
