package LoginModule;

import java.io.IOException;

import org.testng.annotations.Test;

import ObjectRepositoryPOM.LoginPage;
import genericUtilites.BaseClass;
import genericUtilites.UtilityMethods;

public class TC1 extends BaseClass{
	
	@Test
public void Validate_whether_user_login_with_valid_credentials() throws IOException, InterruptedException {
		
	LoginPage login=new LoginPage(driver);
	UtilityMethods utility=new UtilityMethods();
	login.getLoginLink().click();
	Thread.sleep(2000);
	
	//Assert.assertEquals(true, false);
	
	login.getEmailTextField().sendKeys(utility.ReadProperties("username"));
	Thread.sleep(2000);
	
	login.getPasswordTextField().sendKeys(utility.ReadProperties("password"));
	Thread.sleep(2000);
	
	login.getLoginButton().click();
	Thread.sleep(2000);
	}
}
