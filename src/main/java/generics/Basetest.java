package generics;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Basetest {

	public static final String userdir=System.getProperty("user.dir");
	public static final String chromeKey="webdriver.chrome.driver";
	public static final String geckokey="webdriver.gecko.driver";
	public static final String chromeValue=userdir+"\\drivers\\chromedriver.exe";
	public static final String geckoValue=userdir+"\\drivers\\geckodriver.exe";
	public static final String excelPath=userdir+"\\data\\excel.xlsx";

	public static webActionUtil actionUtil;
	public WebDriver driver;
	public Properties prop;

	@BeforeClass
	public void setPath()
	{
		try {
			prop=new Properties();
			FileInputStream f=new FileInputStream(userdir+"\\data\\config.properties");
			prop.load(f);
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
		System.setProperty(chromeKey, chromeValue);
		System.setProperty(geckokey, geckoValue);
	}
	
	@BeforeMethod
	public void launchBrowser()
	{
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(opt);
		actionUtil=new webActionUtil(driver);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(prop.getProperty("url"));
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
}
