package scripts;

import org.testng.annotations.Test;

import generics.Basetest;
import pages.initializePages;

public class swagLogin extends Basetest {
	@Test
	public void swagloginSript()
	{
		initializePages pages = new initializePages(driver);
		pages.swagLogin.login(prop.getProperty("username"),prop.getProperty("password") );
	}
	

}
