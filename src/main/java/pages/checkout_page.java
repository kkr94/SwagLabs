package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkout_page {
	
	@FindBy(id="first-name")
	private WebElement tbFirstName;
	
	@FindBy(id="last-name")
	private WebElement tbLastName;
	
	@FindBy(id="postal-code")
	private WebElement tbPostalCode;
	
	@FindBy(id="continue")
	private WebElement btnContinue;

	@FindBy(id="finish")
	private WebElement btnFinish;
	
	public void enterDetails(String fn,String ln,String pc)
	{
		this.tbFirstName.sendKeys(fn);
		this.tbLastName.sendKeys(ln);
		this.tbPostalCode.sendKeys(pc);
	}
	
	public void ClickContinue()
	{
		this.btnContinue.click();
	}
	
	public void ClickFinish()
	{
		this.btnFinish.click();
	}
	public checkout_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
