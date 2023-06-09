
package com.script;

import org.openqa.selenium.Alert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.generic.BaseTest;
import com.generic.Excel;
import com.page.LoginPage;

public class LoginPageTest extends BaseTest {
	@Test
	public void testLoginPage() throws Exception {

		LoginPage l = new LoginPage(driver);

		l.setUserName("mngr492172");
		l.setPassword("busUpYt");
		l.clickLoginBTN();
		l.verifyMessage("Welcome To Manager's Page of Guru99 Bank");
		l.logout();

		Alert alert = driver.switchTo().alert();
		String actualText = alert.getText();
		alert.accept();
		System.out.println(actualText);

//				String expectedMsg = "User or Password is not valid";
//				if (actualText.equals(expectedMsg)) {
//					Reporter.log("Test is PASSED", true);
//				} else {
//					Reporter.log("Test is Failed", true);
//				}

	}
}
