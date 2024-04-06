package pages;

import org.openqa.selenium.WebDriver;

public class initializePages {
	
	public swaglabs_login_page swagLogin;
	public products_page products;
	public cart_page cart;
	public checkout_page checkout;
	public ordercomplete_page ordercomplete;
	
	public initializePages(WebDriver driver)
	{
		this.swagLogin=new swaglabs_login_page(driver);
		this.products=new products_page(driver);
		this.cart=new cart_page(driver);
		this.checkout=new checkout_page(driver);
		this.ordercomplete=new ordercomplete_page(driver);
	}

}
