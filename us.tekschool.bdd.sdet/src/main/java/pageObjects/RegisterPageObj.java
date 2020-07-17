package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.DriverUtility;

public class RegisterPageObj extends Base {
	public RegisterPageObj() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "(//a[text()='Register'])[1]")
	private WebElement register;

	@FindBy(how = How.XPATH, using = "//input[@id='input-firstname']")
	private WebElement firstNameField;

	@FindBy(how = How.XPATH, using = "//input[@id='input-lastname']")
	private WebElement lastNameField;

	@FindBy(how = How.XPATH, using = "//input[@id='input-email']")
	private WebElement emailField;

	@FindBy(how = How.XPATH, using = "//input[@id='input-telephone']")
	private WebElement telephoneField;

	@FindBy(how = How.XPATH, using = "//input[@id='input-password']")
	private WebElement passwordField;

	@FindBy(how = How.XPATH, using = "//input[@id='input-confirm']")
	private WebElement passwordConfField;

	@FindBy(how = How.XPATH, using = "(//input[@name='newsletter'])[1]")
	private WebElement yesSubscribe;

	@FindBy(how = How.XPATH, using = "(//input[@name='newsletter'])[2]")
	private WebElement noSubscribe;

	@FindBy(how = How.XPATH, using = "//input[@name='agree']")
	private WebElement privacyPolicy;

	@FindBy(how = How.XPATH, using = "//input[@class='btn btn-primary']")
	private WebElement continueButtonReg;

	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Your Account Has Been Created!')]")
	private WebElement yourAcctCreatedMessage;

	public void clickOnRegister() {
		DriverUtility.clickonElement(register);
	}

	public void enterFNameValue(String fName) {
		DriverUtility.enterText(firstNameField, fName);
	}

	public void enterLNameValue(String lName) {
		DriverUtility.enterText(lastNameField, lName);
	}

	public void enterEmailValue(String email) {
		DriverUtility.enterText(emailField, email);
	}

	public void enterTelephoneValue(String telephone) {
		DriverUtility.enterText(telephoneField, telephone);
	}

	public void enterpasswordValue(String password) {
		DriverUtility.enterText(passwordField, password);
	}

	public void enterConfirmPassValue(String passwordConf) {
		DriverUtility.enterText(passwordConfField, passwordConf);
	}

	public boolean noIsSelected() {
		if (noSubscribe.isSelected()) {
			return true;
		} else {
			return false;
		}
	}

	public void selectYesonSubscribe() {
		DriverUtility.clickonElement(yesSubscribe);
	}

	public boolean isPrivacyPolicyDisplayed() {
		boolean displayed = DriverUtility.isElementDisplayed(privacyPolicy);
		return displayed;
	}

	public void clickonPrivacyPolicy() {
		DriverUtility.clickonElement(privacyPolicy);
	}

	public void clickonContinueButtonREG() {

		DriverUtility.clickonElement(continueButtonReg);
	}

	public String getSuccessfullAcctCreationMessage() {
		String acctCreationMessage = DriverUtility.getText(yourAcctCreatedMessage);
		return acctCreationMessage;
	}
	public void selectNoSubscribe() {
		DriverUtility.clickonElement(noSubscribe);
	}

}
