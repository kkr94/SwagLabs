package generics;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class webActionUtil {

	WebDriver driver;
	
	public webActionUtil(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void captureScreenShot(String scriptname)
	{
		TakesScreenshot t=(TakesScreenshot) driver;
		File src=t.getScreenshotAs(OutputType.FILE);
		File dest=new File(Basetest.userdir+"\\screenshot\\"+scriptname+".png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
	}
	
	public void validateTitle(String expectedtitle)
	{
		try {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.titleIs(expectedtitle));
		Reporter.log("Title is matching");
		}
		catch(Exception e) {
		Reporter.log("Title is not matching");
		Assert.fail();
		}
	}
	
	public void doubleClick(WebElement element)
	{
		Actions a=new Actions(driver);
		a.doubleClick(element).perform();	
	}
	
	public void rightClick(WebElement element)
	{
		Actions a=new Actions(driver);
		a.contextClick(element).perform();
	}
}
