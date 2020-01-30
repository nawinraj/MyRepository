import java.util.concurrent.TimeUnit;

public class Executable extends BaseClass
{
	public static void main(String[] args) throws InterruptedException 
	{
		getDriver();
		loadUrl("https://adactin.com/HotelApp/");
		Login l = new Login();
		fill(l.getTxtmail(), "naveen34");
		fill(l.getTxtpwd(), "Asai123");
		btnclick(l.getBtn());
		SearchHotel sh = new SearchHotel();
		drop(sh.getLoc(), "London");
		drop(sh.getHotel(), "Hotel Cornice");
		drop(sh.getRoom(), "Double");
		drop(sh.getRoomno(), "10 - Ten");
		drop(sh.getAdult(), "3 - Three");
		drop(sh.getChild(), "1 - One");
		btnclick(sh.getBtn());
		SelectHotel selhot = new SelectHotel();
		btnclick(selhot.getRadio());
		btnclick(selhot.getBtn());
		bookAhotel bk = new bookAhotel();
		fill(bk.getFirstName(), "Naveen");
		fill(bk.getLastName(), "Raj");
		fill(bk.getAddress(), "54, mg nagar");
		fill(bk.getCreditcardno(), "7654334567898765");
		drop(bk.getCctype(), "Master Card");
		drop(bk.getCc_exp_month(), "February");
		drop(bk.getCc_exp_year(), "2022");
		fill(bk.getCc_cvv(), "154");
		btnclick(bk.getBtn());
		driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
		BookingConfirmation cnfrm = new BookingConfirmation();
		btnclick(cnfrm.getItinerary());
		Logout lo = new Logout();
		btnclick(lo.getLogout());
		ClicktoLogin ck = new ClicktoLogin();
		btnclick(ck.getBtn());
		
		driver.quit();
		
	}
}
