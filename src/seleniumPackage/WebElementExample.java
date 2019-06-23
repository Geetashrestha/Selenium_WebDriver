package seleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebElementExample {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver= InitializeWebDriver.getDriver("Chrome");
		
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		driver.findElement(By.name("firstname")).sendKeys("Geeta");
			

		driver.findElement(By.name("lastname")).sendKeys("Shrestha");
		Thread.sleep(2000);
		click_RadioButton_CheckBox(driver,"sex", "Female");
		click_RadioButton_CheckBox(driver, "exp", "2"); 
		driver.findElement(By.id("datepicker")).sendKeys("12/12/2018");
		click_RadioButton_CheckBox(driver, "profession","Manual Tester");
		click_RadioButton_CheckBox(driver, "tool","QTP");
		click_RadioButton_CheckBox(driver, "tool","Selenium IDE");
		
		WebElement element_Continents = driver.findElement(By.id("continents"));
		Select select=new Select(element_Continents);
		System.out.println(select.isMultiple());
		//SelectByIndex
		
		select.selectByIndex(2);
		Thread.sleep(1000);
		//SelectByValue	
		//SelectByVisibleText
		select.selectByVisibleText("Australia");
		// multiselect dropdown
		WebElement element_commands = driver.findElement(By.id("selenium_commands"));
		Select select_multiple=new Select (element_commands);
		select_multiple.selectByVisibleText("Browser Commands");
		select_multiple.selectByVisibleText("Switch Commands");
		
		//select_multiple.deselectAll(); // de-select method only work for multiple selection drop-down.
		System.out.println((select_multiple.isMultiple()));
		WebElement firstSelectedElement=select_multiple.getFirstSelectedOption();
		System.out.println(firstSelectedElement.getText());
		
		List<WebElement> availableOpetionList=select_multiple.getOptions();
				for(int i=0; i<availableOpetionList.size(); i++) {
					String text =availableOpetionList.get(i).getText(); 
					System.out.println(text);
					
				}
				List<WebElement>SelectedList=select_multiple.getAllSelectedOptions();
				for(int i=0;i<SelectedList.size();i++) {
					String text=SelectedList.get(i).getText();
					System.out.println(text);
					
				}
		select_multiple.deselectByVisibleText("Browser Commands");
		select_multiple.deselectAll();
	}
		
	

	/*public static void click_radioButton(WebDriver driver, String genderType) {
		if (genderType.equalsIgnoreCase("MALE")) {
			driver.findElement(By.id("sex-0")).click();
		}else if(genderType.equalsIgnoreCase("FEMALE")){
			driver.findElement(By.id("sex-1")).click();
		}else {
			System.out.println("Please enter the correct input either MALE or FEMALE");
			
		}
			}
	public static void click_YearsOfExperience(WebDriver driver, String numberOfYears) {
		driver.findElement(By.xpath("//input[@name= 'exp' and @value ='"+numberOfYears+"']")).click();*/

	// instead of write this long code we can also generalized this code "name" and "value"
	
	public static void click_RadioButton_CheckBox(WebDriver driver, String name, String value) {
		driver.findElement(By.xpath("//input[@name= '"+name+"' and @value ='"+value+"']")).click();
		
		
	}
}