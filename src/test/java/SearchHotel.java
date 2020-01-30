import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchHotel extends BaseClass 

{
	public SearchHotel() 
	{
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(id="location")
	private WebElement loc;
	
	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy(id="room_type")
	private WebElement room;
	
	@FindBy(id="room_nos")
	private WebElement roomno;
	
	@FindBy(id="datepick_in")
	private WebElement datePickIn;
	
	@FindBy(id="datepick_out")
	private WebElement datePickOut;
	
	@FindBy(id="adult_room")
	private WebElement adult;
	
	@FindBy(id="child_room")
	private WebElement child;
	
	@FindBy(id="Submit")
	private WebElement btn;

	public WebElement getLoc() {
		return loc;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getRoomno() {
		return roomno;
	}

	public WebElement getDatePickIn() {
		return datePickIn;
	}

	public WebElement getDatePickOut() {
		return datePickOut;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getBtn() {
		return btn;
	}
	
	
	
	
	
}
