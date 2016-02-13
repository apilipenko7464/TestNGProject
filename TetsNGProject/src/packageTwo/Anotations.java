package packageTwo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Anotations extends Annot2 {

	 
	@BeforeMethod 
	public void  UseridGeneration()
	{System.out.println("User Id Generation");}
	//delete cookies
	
	@BeforeTest
	 public void Cookies ()
	 {System.out.println("Delete the Cookies before starting test");}
	
	@AfterTest
	public void Cookiesclose()
	{System.out.println("Delete Cookies after compliting all tests");}
	//close the browser
	
	@Test
	public void  OpeningBrowser(){
System.out.println("OpeningBrowser");
	}
	@Test
	public void FlightBooking()
	{
		System.out.println("FlightBooking");}
}
