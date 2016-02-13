package testngFiles;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Annot2 {
	
@BeforeSuite
	public void installsoftware()
	{
		System.out.println("I am the First");
	}

@AfterSuite
public void deinstallsoftware()
{System.out.println("I am the Last");
	}
	
}
