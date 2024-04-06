package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.Basetest;

public class swaglabs_login_page {
	@FindBy(name="user-name")
	private WebElement tbUsername;
 
	@FindBy(name="password")
	private WebElement tbPassword;
	
	@FindBy(name="login-button")
	private WebElement btnLoginButton;
	
	public void login(String un,String pw)
	{
		this.tbUsername.sendKeys(un);
		this.tbPassword.sendKeys(pw);
		this.btnLoginButton.click();
		Basetest.actionUtil.validateTitle("Swag Labs");
	}
	
	public swaglabs_login_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
