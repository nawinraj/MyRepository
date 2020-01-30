import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout extends BaseClass 
{

	public Logout() 
	{
	
		PageFactory.initElements(driver, this);
	
	}
	
	
	@FindBy(id="logout")
	private WebElement logout;


	public WebElement getLogout() {
		return logout;
	}
	
}
