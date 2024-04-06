package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class products_page {

	@FindBy(className="product_sort_container")
	private WebElement ddSortinglist;
	
	@FindBy(id="add-to-cart-sauce-labs-bike-light")
	private WebElement btnBikeLight;
	
	@FindBy(id="add-to-cart-sauce-labs-bolt-t-shirt")
	private WebElement btnShirt;
	
	@FindBy(id="add-to-cart-test.allthethings()-t-shirt-(red)")
	private WebElement btnTshirtred;
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	private WebElement btnBackpack;
	
	@FindBy(id="add-to-cart-sauce-labs-fleece-jacket")
	private WebElement btnJacket;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement btnAddtocart;
	
	public void ClickSortbtn()
	{
		Select s=new Select(ddSortinglist);
		s.selectByValue("lohi");
	}
	public void ClickbackpackBtn()
	{
		this.btnBackpack.click();
	}
	
	public void ClickAddjacketBtn()
	{
		this.btnJacket.click();
	}
	
	public void ClickbikelightBtn()
	{
		this.btnBikeLight.click();
	}
	
	public void ClickgotocartBtn()
	{
		this.btnAddtocart.click();
	}
	
	public products_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
