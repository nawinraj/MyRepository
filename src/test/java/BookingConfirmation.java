import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmation extends BaseClass

{

	public BookingConfirmation() 
	{
	PageFactory.initElements(driver, this);
	
	}
	
	
	@FindBy(id="my_itinerary")
	private WebElement itinerary;


	public WebElement getItinerary() {
		return itinerary;
	}


	
	
	
	
	
	
}
