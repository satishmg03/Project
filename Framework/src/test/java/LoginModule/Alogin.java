package LoginModule;

import java.io.IOException;

import org.testng.annotations.Test;

import ObjectRepositoryPOM.AmazonLoginPage;
import ObjectRepositoryPOM.LoginPage;
import genericUtilites.BaseClass;
import genericUtilites.UtilityMethods;

public class Alogin extends BaseClass{
	
	@Test
public void Validate_whether_user_login_with_valid_credentials() throws IOException, InterruptedException {
		
	AmazonLoginPage login=new AmazonLoginPage(driver);
	UtilityMethods utility=new UtilityMethods();
	
	login.getTextField().sendKeys(utility.ReadProperties("Ausername"));
	Thread.sleep(2000);
	
	login.getBtn().click();
	Thread.sleep(2000);
	
	login.getPwd().sendKeys(utility.ReadProperties("Apwd"));
	Thread.sleep(2000);
	
	login.getSignin().click();
	Thread.sleep(2000);
	}
}