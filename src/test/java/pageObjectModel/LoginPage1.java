package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
WebDriver driver;
	
	//@FindBy(how = How.ID, using="username") //another way of using @findby
	
	@FindBy(id="username")
	private WebElement username;

	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement loginButton;
	
	public WebElement getUsername() {
		return username;
	}
	
	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getLoginButton() {
		return loginButton;
	}
	
	
	public LoginPage1(WebDriver d) {
		driver = d;
		PageFactory.initElements(driver, this);
	}
}
