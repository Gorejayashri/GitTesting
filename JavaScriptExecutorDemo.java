import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) {

		System.out.println("Learning all locators in selenium ");
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
		
         driver.get("http://demo.guru99.com/V4/");
		
		driver.manage().window().maximize();
		
		WebElement BtnLogin = driver.findElement(By.xpath("//input[@name='btnLogin']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("alert('Welcome to inspire');");
		
		driver.switchTo().alert().dismiss();
		js.executeScript("arguments[0].click();", BtnLogin);
		
		driver.switchTo().alert().accept();
		
		String DomaineName = js.executeScript("return document.domain;").toString();
		 
		System.out.println(DomaineName);
		
		String Tiltle = js.executeScript("return document.title;").toString();
		
		System.out.println(Tiltle);
		
		String url = js.executeScript("return document.URL;").toString();
		
		System.out.println(url);
		
		js.executeAsyncScript("window.location = 'https://www.amazon.in/'");

	    WebElement insta = driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[3]/ul/li[3]/a"));
				
		js.executeScript("arguments[0].scrollIntoView(true);",insta);
			

	}

}
