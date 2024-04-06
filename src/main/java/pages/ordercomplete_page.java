package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ordercomplete_page {
	
	String expectedtxt="Thank you for your order!";
	@FindBy(xpath="//h2[contains(text(),'Thank')]")
	private WebElement txt;
	
	public void validate()
	{
		String actualtxt=this.txt.getText();
		if(expectedtxt.equals(actualtxt))
			System.out.println("order is succesful");
		else
			System.out.println("transaction failed!");
	}
	
	public ordercomplete_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
