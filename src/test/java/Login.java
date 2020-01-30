import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BaseClass 
{
	
	public Login() 
	{
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(id="username")
	private WebElement txtmail;
	
	@FindBy(id="password")
	private WebElement txtpwd;
	
	@FindBy(id="login")
	private WebElement btn;

	public WebElement getTxtmail() {
		return txtmail;
	}

	public WebElement getTxtpwd() {
		return txtpwd;
	}

	public WebElement getBtn() {
		return btn;
	}
	
	
	
	
	
	
	
	
	
}
