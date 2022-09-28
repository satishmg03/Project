package ObjectRepositoryPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class AmazonLoginPage {

	public AmazonLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "email")
	private WebElement TextField;

	public WebElement getTextField() {
		return TextField;
	}
	
	@FindBy(id = "continue")
	private WebElement btn;

	public WebElement getBtn() {
		return btn;
	}
	
	@FindBy(name = "password")
	private WebElement pwd;

	public WebElement getPwd() {
		return pwd;
	}
	
	@FindBy(id = "signInSubmit")
	private WebElement signin;

	public WebElement getSignin() {
		return signin;
	}
	
	//Search bar--------------------------------
	
	@FindBy(id = "twotabsearchtextbox")
	private WebElement serach;

	public WebElement getSerach() {
		return serach;
	}
	}