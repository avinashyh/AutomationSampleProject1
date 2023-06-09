
package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generic.BasePage;

public class NewCustomerPage extends BasePage {

	@FindBy(name = "uid")
	private WebElement unTB;

	@FindBy(name = "password")
	private WebElement pwTB;

	@FindBy(name = "btnLogin")
	private WebElement loginBTN;

	@FindBy(className = "heading3")
	private WebElement verifyMessage;

//			@FindBy(linkText="Log out")
//			private WebElement logoutBtn;

//			public void logout() {
//				logoutBtn.click();

	@FindBy(linkText = "New Customer")
	private WebElement newCustomer;

	@FindBy(name = "name")
	private WebElement nameTB;

	@FindBy(name = "rad1")
	private WebElement female;

	@FindBy(id = "dob")
	private WebElement dateOfBirth;

	@FindBy(name = "addr")
	private WebElement address;

	@FindBy(name = "city")
	private WebElement city1;

	@FindBy(name = "state")
	private WebElement state;

	@FindBy(name = "pinno")
	private WebElement pincode;

	@FindBy(name = "telephoneno")
	private WebElement mobileNumber;

	@FindBy(name = "emailid")
	private WebElement emailId;

	@FindBy(name = "password")
	private WebElement password1;

	@FindBy(name = "sub")
	private WebElement submit;

	public NewCustomerPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void setUserName(String un) {
		unTB.sendKeys(un);
	}

	public void setPassword(String pw) {
		pwTB.sendKeys(pw);
	}

	public void clickLoginBTN() {
		loginBTN.click();

	}

	public void verifyMessage(String eText) {
		verifyText(verifyMessage, eText);
	}

	public void clickNewCustomer() {
		newCustomer.click();
	}

	public void setCustomerName(String name) {
		nameTB.sendKeys(name);
	}

	public void clickFemale() {
		female.click();
	}

	public void setDateOfBirth(String dob) {
		dateOfBirth.sendKeys(dob);
	}

	public void setAddress(String adrs) {
		address.sendKeys(adrs);
	}

	public void setCity(String city) {
		city1.sendKeys(city);
	}

	public void setState(String state1) {
		state.sendKeys(state1);
	}

	public void setPincode(String pin) {
		pincode.sendKeys(pin);
	}

	public void setTelephone(String mn) {
		mobileNumber.sendKeys(mn);
	}

	public void setEmailID(String email) {
		emailId.sendKeys(email);
	}

	public void setPassword1(String pw1) {
		password1.sendKeys(pw1);
	}

	public void clickSubmit() {
		submit.click();

	}

}

//			public void verifyMessage(String eText) {
//				verifyText(verifyMessage, eText);
//			}
// }

//			public void logout() {
//				logoutBtn.click();
//
// }
