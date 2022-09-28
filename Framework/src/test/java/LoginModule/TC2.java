package LoginModule;

import org.testng.annotations.Test;

import ObjectRepositoryPOM.LoginPage;
import genericUtilites.BaseClass;
import genericUtilites.ReadXL;

public class TC2 extends BaseClass {
	
	@Test(dataProvider = "testdata", dataProviderClass = ReadXL.class)
	
	public void enteringInvalideData(String data1,String data2) {
		
		LoginPage login = new LoginPage(driver);
		
		login.getLoginLink().click();
		
		login.getEmailTextField().sendKeys(data1);
		
		login.getPasswordTextField().sendKeys(data2);
		
	}

}
