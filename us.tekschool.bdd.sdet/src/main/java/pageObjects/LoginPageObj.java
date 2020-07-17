package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LoginPageObj extends Base {

	// create a constructor
	public LoginPageObj() {

		// We will use initElements to initialize all webElements in this page
		PageFactory.initElements(driver, this);
	}
	// Storing WebElelements for Login Page

	// @FindBy annotation used in pageFactory to find WebElement
	@FindBy(how = How.XPATH, using = "//span[text()='My Account']")
	private WebElement myAccount;

	// store login WebElement
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Login')]")
	private WebElement login;

	// Store Email Webelement
	@FindBy(how = How.ID, using = "input-email")
	private WebElement Email;

	// Store password WebElement
	@FindBy(id = "input-password")
	private WebElement Password;

	// Store LoginButton WebElement
	@FindBy(how = How.XPATH, using = "//input[@class='btn btn-primary']")
	private WebElement loginButton;

	@FindBy(how = How.LINK_TEXT, using = "Logout")
	private WebElement logoutButton;

	// Start writing Methods.
	public void clickOnMyAccount() {
		myAccount.click();
	}

	public void clickOnLogin() {
		login.click();
	}

	public void enterEmail(String emailAddress) {
		Email.clear();
		Email.sendKeys(emailAddress);
	}

	public void enterPassword(String password) {
		Password.clear();
		Password.sendKeys(password);

	}

	public void clickOnLoginButton() {
		loginButton.click();
	}

	public String getPageTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
	}

	public void clickOnLogOutButton() {
		logoutButton.sendKeys(Keys.ENTER);
	}
}
