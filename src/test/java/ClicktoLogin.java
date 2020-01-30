import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClicktoLogin extends BaseClass
{
	public ClicktoLogin() 
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[text()='Click here to login again']")
	private WebElement btn;

	public WebElement getBtn() {
		return btn;
	}



}

