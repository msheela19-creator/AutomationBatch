package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="Email")
	private WebElement emailtextfield;
	
	@FindBy(id="Password")
	private WebElement passwordtextfield;
	
	@FindBy(xpath = "//input[@type='submit'])[2]")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement  getEmailTextField() {
		return emailtextfield;
	}
    
	public WebElement getPasswordTextField() {
		return passwordtextfield;
	}
	
	public WebElement getLoginButton() {
		return loginButton;
	}
	
}
