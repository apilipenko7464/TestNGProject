package testngFiles;

import org.testng.annotations.Test;

public class DependencyAnnot {
	@Test
	public void  Openingbrowser()
	{
		System.out.println("Executing opening Browser");
	}
	//@Test(dependsOnMethods = {"OpeningBrowser"}, alwaysRun=true)
	public void FlightBooking()
	{
		System.out.println("Executing Flighbooking");
	}
	@Test (timeOut=45000)
	public void Timerelated()
	{System.out.println("New Test Case");}
	
	@Test (enabled=false)
	public void Payment()
	{System.out.println("Payment Testcase");}

}
