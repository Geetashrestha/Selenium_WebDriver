package seleniumPackage;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GmailAssessment {
	
			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
				
				WebDriver driver=InitializeWebDriver.getDriver("chrome");
				driver.get(" https://www.gmail.com");	
				driver.findElement(By.name("identifier")).sendKeys("geetshayaa");		
				driver.findElement(By.xpath("//span[text()='Next']")).click();
				driver.findElement(By.name("password")).sendKeys("H0ney.com");
				Thread.sleep(5000);
				driver.findElement(By.xpath("//span[text()='Next']")).click();
				
				boolean isDisplayed=driver.findElement(By.xpath("//div[@gh='cm']")).isDisplayed();
				
				if(isDisplayed==true){
					System.out.println("Compose box is displayed");
					
					driver.findElement(By.xpath("//div[@gh='cm']")).click();
					
					if(driver.findElement(By.xpath("//div[text()='New Message']")).isDisplayed()==true){
						
						Set<String> set=driver.getWindowHandles();
						System.out.println(set.size());
						driver.findElement(By.name("to")).sendKeys("geetsha@gmail.com");
						driver.findElement(By.name("subjectbox")).sendKeys("test");
						driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("text");
						driver.findElement(By.xpath("//div[contains(@aria-label,'Send') and @role='button']")).click();
						
					}else{
						System.out.println("New Mail window is not opened");
					}
				}
				
				

			}

		

	}
	


