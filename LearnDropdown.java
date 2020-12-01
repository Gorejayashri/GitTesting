import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class LearnDropdown {

	public static void main(String[] args) {
		System.out.println("Learning all locators in selenium ");
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
         driver.get("https://www.amazon.in");
		
		driver.manage().window().maximize();
		
		// Static DP Using select
		
		Select select = new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
		//select.selectByVisibleText("Deals");
		//select.selectByIndex(7);
		//select.selectByValue("search-alias=todays-deals");
		select.selectByValue("search-alias=alexa-skills");
		
		
		
		
	
		
		
	

	}

}
