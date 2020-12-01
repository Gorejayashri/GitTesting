import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {

	public static void main(String[] args) {
		
        System.out.println("Learning all locators in selenium ");
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		driver.manage().window().maximize();
		
		
		
		// Using Id locators
	   WebElement LocId = driver.findElement(By.id("firstName"));
	   
	   WebElement LastName = driver.findElement(By.id("lastName"));
	   
	   WebElement male = driver.findElement(By.className("//*[@id=\"genterWrapper\"]/div[2]/div[1]"));
	   
	   
	
	   LocId.sendKeys("jaya"); 
	   LastName.sendKeys("Gore");
	   
	   male.click();
		

	}

}
