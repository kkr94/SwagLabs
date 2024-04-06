package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cart_page {

	@FindBy(id="checkout")
	private WebElement btnCheckout;
	
	public void ClickCheckOutbtn()
	{
		this.btnCheckout.click();
	}
	
	public cart_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
