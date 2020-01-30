import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass 
{

	static WebDriver driver;
	
	public static WebDriver getDriver() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Naveen\\drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		return driver;
	}
	
	public static void loadUrl(String url) 
	{
		driver.get(url);
	
	}
	
	public static void fill(WebElement element, String name) 
	{
		element.sendKeys(name);
	}
	
	public static void btnclick(WebElement element) 
	{
		element.click();
	}

	public static void drop(WebElement element, String text) 
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
		
	}
	
	
	
	
	
	
	
	
}
