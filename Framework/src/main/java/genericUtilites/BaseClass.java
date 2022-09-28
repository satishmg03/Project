package genericUtilites;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	@BeforeSuite(alwaysRun = true)
	public void OpenBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		System.out.println("Browser launched Successfully");
		driver.manage().window().maximize();
		System.out.println("window maximized Successfully");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@BeforeClass(alwaysRun = true)
	public void OpenApp() {
		
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		System.out.println("Navigate to application Successfully");
	}
	
//	@AfterMethod(alwaysRun = true)
//	public void TakeSS(ITestResult result) throws IOException {
//		
//		if(result.getStatus()==result.FAILURE) {
//			ScreenshotUtility screenshot=new ScreenshotUtility();
//			screenshot.takingScreenshot(driver, result.getName());
//		}
//	}
	
	@AfterClass(alwaysRun = true)
	public void logoutApp() throws IOException {

		System.out.println("logging out");
		System.out.println("Logged out Successfully");
	}
	
	@AfterSuite(alwaysRun = true)
	public void CloseBrowser() 
	{
		driver.quit();
		System.out.println("Browser quitted Successfully");
	}
}
