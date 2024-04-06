package scripts;

import org.testng.annotations.Test;

import generics.Basetest;
import pages.initializePages;

public class swagBuy extends Basetest {
	

	@Test
	public void swagBuyScript()
	{
		initializePages pages=new initializePages(driver);
		pages.swagLogin.login(prop.getProperty("username"),prop.getProperty("password"));
		pages.products.ClickSortbtn();
		pages.products.ClickAddjacketBtn();
		pages.products.ClickbackpackBtn();
		pages.products.ClickgotocartBtn();
		pages.cart.ClickCheckOutbtn();
		pages.checkout.enterDetails("kiran", "kumar", "570021");
		pages.checkout.ClickContinue();
		pages.checkout.ClickFinish();
		pages.ordercomplete.validate();
	}
}
