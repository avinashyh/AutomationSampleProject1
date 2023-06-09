
package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generic.BasePage;

public class LoginPage extends BasePage {

	@FindBy(name = "uid")
	private WebElement unTB;

	@FindBy(name = "password")
	private WebElement pwTB;

	@FindBy(name = "btnLogin")
	private WebElement loginBTN;

	@FindBy(className = "heading3")
	private WebElement verifyMessage;

	@FindBy(linkText = "Log out")
	private WebElement logoutBtn;

	public LoginPage(WebDriver driver) {
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

	public void logout() {
		logoutBtn.click();
	}
}
