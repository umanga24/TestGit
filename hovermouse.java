package hover;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hovermouse {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\seleniumwebdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.get("http://executeautomation.com/demosite/index.html");
		driver.manage().window().maximize();
		WebElement menu = driver.findElement(By.xpath("//*[@id=\"Automation Tools\"]"));
		WebElement submenu = driver.findElement(By.xpath("//*[@id=\"Selenium\"]"));
		WebElement subsubmenu = driver.findElement(By.xpath("//*[@id=\"Selenium WebDriver\"]"));
		Hover(driver, menu);
		Hoverandclick(driver, submenu, subsubmenu);
		
		}
	
	// public static void Hover(WebDriver driver, WebElement element) {
		 
	Actions action = new Actions(driver);
	action.moveToElement(element).perform();
	   }
	 public static void Hoverandclick(WebDriver driver, WebElement elementhover, WebElement elementclick) 
	 {
		 Actions action = new Actions(driver);
		 action.moveToElement(elementhover).click(elementclick).build().perform();
		 
	 }
	 
	
}
